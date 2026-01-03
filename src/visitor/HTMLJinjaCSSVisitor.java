package visitor;

import SymbolTable.SymbolTable;
import SymbolTable.Row;
import gen.Parser_HTML_Jinja_CSS;
import gen.Parser_HTML_Jinja_CSSBaseVisitor;
import ast.ASTNode;
import ast.ast_html_css_jinja.DocumentNode;
import ast.ast_html_css_jinja.html.*;
import ast.ast_html_css_jinja.css.*;
import ast.ast_html_css_jinja.jinja.*;

public class HTMLJinjaCSSVisitor extends Parser_HTML_Jinja_CSSBaseVisitor<ASTNode> {

    private SymbolTable symbolTable = new SymbolTable();
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public ASTNode visitDocument(Parser_HTML_Jinja_CSS.DocumentContext ctx) {
        DocumentNode document = new DocumentNode(ctx.getStart().getLine());
        
        if (ctx.node() != null) {
            for (Parser_HTML_Jinja_CSS.NodeContext nodeCtx : ctx.node()) {
                ASTNode result = visit(nodeCtx);
                if (result != null) {
                    document.addNode(result);
                }
            }
        }
        
        return document;
    }

    @Override
    public ASTNode visitDoctypeNode(Parser_HTML_Jinja_CSS.DoctypeNodeContext ctx) {
        return visit(ctx.doctype());
    }

    @Override
    public ASTNode visitHtmlNode(Parser_HTML_Jinja_CSS.HtmlNodeContext ctx) {
        return visit(ctx.htmlElement());
    }

    @Override
    public ASTNode visitVoidElements_img_input_br_hr(Parser_HTML_Jinja_CSS.VoidElements_img_input_br_hrContext ctx) {
        return visit(ctx.htmlVoidElement());
    }

    @Override
    public ASTNode visitStyleNode(Parser_HTML_Jinja_CSS.StyleNodeContext ctx) {
        return visit(ctx.styleElement());
    }

    @Override
    public ASTNode visitJinjaStmtNode(Parser_HTML_Jinja_CSS.JinjaStmtNodeContext ctx) {
        return visit(ctx.jinjaStatement());
    }

    @Override
    public ASTNode visitJinjaExprNode(Parser_HTML_Jinja_CSS.JinjaExprNodeContext ctx) {
        return visit(ctx.jinjaExpression());
    }

    @Override
    public ASTNode visitTextNode(Parser_HTML_Jinja_CSS.TextNodeContext ctx) {
        int line = ctx.getStart().getLine();
        String text = ctx.TEXT().getText();
        
        // Filter out whitespace-only text nodes (newlines, spaces, tabs)
        // These are typically formatting whitespace around closing tags
        if (text.trim().isEmpty()) {
            return null;
        }
        
        return new TextNode(text, line);
    }

    @Override
    public ASTNode visitDoctype(Parser_HTML_Jinja_CSS.DoctypeContext ctx) {
        int line = ctx.getStart().getLine();
        return new DoctypeNode(line);
    }

    @Override
    public ASTNode visitHtmlElement(Parser_HTML_Jinja_CSS.HtmlElementContext ctx) {
        int line = ctx.getStart().getLine();
        String tagName = "";
        
        // Extract tag name from first IDENTIFIER after LT (opening tag)
        if (ctx.IDENTIFIER().size() > 0) {
            tagName = ctx.IDENTIFIER(0).getText();
        }
        
        HtmlElementNode elementNode = new HtmlElementNode(tagName, line);
        
        // Visit child nodes (content between opening and closing tags)
        // The grammar structure: LT IDENTIFIER ... GT node* LT SLASH IDENTIFIER GT
        // We need to visit the nodes in the middle
        if (ctx.node() != null) {
            for (Parser_HTML_Jinja_CSS.NodeContext nodeCtx : ctx.node()) {
                ASTNode result = visit(nodeCtx);
                if (result != null) {
                    elementNode.addChild(result);
                }
            }
        }
        
        // Extract closing tag line number
        // The grammar structure: LT IDENTIFIER ... GT node* LT SLASH IDENTIFIER GT
        // The last IDENTIFIER is the closing tag name, and we can get its line from the stop token
        if (ctx.getStop() != null) {
            // Get the line from the GT token after the closing tag
            elementNode.setClosingTagLine(ctx.getStop().getLine());
        }
        
        return elementNode;
    }

    @Override
    public ASTNode visitHtmlVoidElement(Parser_HTML_Jinja_CSS.HtmlVoidElementContext ctx) {
        int line = ctx.getStart().getLine();
        String tagName = "";
        
        if (ctx.IDENTIFIER().size() > 0) {
            tagName = ctx.IDENTIFIER(0).getText();
        }
        
        return new VoidElementNode(tagName, line);
    }

    @Override
    public ASTNode visitStyleElement(Parser_HTML_Jinja_CSS.StyleElementContext ctx) {
        int line = ctx.getStart().getLine();
        StyleNode styleNode = new StyleNode(line);
        
        if (ctx.css_rule() != null) {
            for (Parser_HTML_Jinja_CSS.Css_ruleContext ruleCtx : ctx.css_rule()) {
                ASTNode result = visit(ruleCtx);
                if (result instanceof CssRuleNode) {
                    styleNode.addRule((CssRuleNode) result);
                }
            }
        }
        
        return styleNode;
    }

    @Override
    public ASTNode visitJinjaStatement(Parser_HTML_Jinja_CSS.JinjaStatementContext ctx) {
        if (ctx.jinjaForStatement() != null) {
            return visit(ctx.jinjaForStatement());
        } else if (ctx.jinjaIfStatement() != null) {
            return visit(ctx.jinjaIfStatement());
        }
        return null;
    }

    @Override
    public ASTNode visitJinjaForStatement(Parser_HTML_Jinja_CSS.JinjaForStatementContext ctx) {
        int line = ctx.getStart().getLine();
        String variable = "";
        String iterable = "";
        
        if (ctx.IDENTIFIER().size() >= 2) {
            variable = ctx.IDENTIFIER(0).getText();
            iterable = ctx.IDENTIFIER(1).getText();
        }
        
        JinjaForNode forNode = new JinjaForNode(variable, iterable, line);

        symbolTable.enterScope("for-loop-" + line);
        Row row = new Row();
        row.setName(variable);
        row.setType("variable");
        row.setValue(null);
        symbolTable.addRow(variable, row);


        // Visit body nodes
        if (ctx.node() != null) {
            for (Parser_HTML_Jinja_CSS.NodeContext nodeCtx : ctx.node()) {
                ASTNode result = visit(nodeCtx);
                if (result != null) {
                    forNode.addNode(result);
                }
            }
        }
        symbolTable.exitScope();
        return forNode;
    }

    @Override
    public ASTNode visitJinjaIfStatement(Parser_HTML_Jinja_CSS.JinjaIfStatementContext ctx) {
        int line = ctx.getStart().getLine();
        String condition = "";
        
        if (ctx.ifCondition() != null) {
            Parser_HTML_Jinja_CSS.IfConditionContext condCtx = ctx.ifCondition();
            StringBuilder condBuilder = new StringBuilder();
            
            if (condCtx.NOT() != null) {
                condBuilder.append("not ");
            }
            
            if (condCtx.IDENTIFIER().size() > 0) {
                for (int i = 0; i < condCtx.IDENTIFIER().size(); i++) {
                    if (i > 0) {
                        condBuilder.append(".");
                    }
                    condBuilder.append(condCtx.IDENTIFIER(i).getText());
                }
            }
            
            condition = condBuilder.toString();
        }
        
        JinjaIfNode ifNode = new JinjaIfNode(condition, line);
        
        // Visit body nodes
        if (ctx.node() != null) {
            for (Parser_HTML_Jinja_CSS.NodeContext nodeCtx : ctx.node()) {
                ASTNode result = visit(nodeCtx);
                if (result != null) {
                    ifNode.addNode(result);
                }
            }
        }
        
        return ifNode;
    }

    @Override
    public ASTNode visitJinjaExpression(Parser_HTML_Jinja_CSS.JinjaExpressionContext ctx) {
        int line = ctx.getStart().getLine();
        StringBuilder exprBuilder = new StringBuilder();
        
        if (ctx.IDENTIFIER().size() > 0) {
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                if (i > 0) {
                    exprBuilder.append(".");
                }
                exprBuilder.append(ctx.IDENTIFIER(i).getText());
            }
        }
        
        return new JinjaExpressionNode(exprBuilder.toString(), line);
    }

    @Override
    public ASTNode visitCss_rule(Parser_HTML_Jinja_CSS.Css_ruleContext ctx) {
        int line = ctx.getStart().getLine();
        String selector = "";
        
        if (ctx.css_selector() != null) {
            Parser_HTML_Jinja_CSS.Css_selectorContext selectorCtx = ctx.css_selector();
            
            if (selectorCtx.CSS_DOT() != null && selectorCtx.CHARACTERS().size() > 0) {
                // Class selector: .classname
                selector = "." + selectorCtx.CHARACTERS(0).getText();
            } else if (selectorCtx.CHARACTERS().size() > 0) {
                // Element selector or pseudo-selector
                StringBuilder selectorBuilder = new StringBuilder();
                for (int i = 0; i < selectorCtx.CHARACTERS().size(); i++) {
                    if (i > 0 && selectorCtx.COLON() != null) {
                        selectorBuilder.append(":");
                    }
                    selectorBuilder.append(selectorCtx.CHARACTERS(i).getText());
                }
                selector = selectorBuilder.toString();
            }
        }
        
        CssRuleNode ruleNode = new CssRuleNode(selector, line);
        
        if (ctx.css_property() != null) {
            for (Parser_HTML_Jinja_CSS.Css_propertyContext propCtx : ctx.css_property()) {
                ASTNode result = visit(propCtx);
                if (result instanceof CssPropertyNode) {
                    ruleNode.addProperty((CssPropertyNode) result);
                }
            }
        }
        
        return ruleNode;
    }

    @Override
    public ASTNode visitCss_property(Parser_HTML_Jinja_CSS.Css_propertyContext ctx) {
        int line = ctx.getStart().getLine();
        String name = "";
        String value = "";
        
        if (ctx.CHARACTERS() != null) {
            name = ctx.CHARACTERS().getText();
        }
        
        if (ctx.css_value() != null) {
            Parser_HTML_Jinja_CSS.Css_valueContext valueCtx = ctx.css_value();
            StringBuilder valueBuilder = new StringBuilder();
            
            // Collect all tokens in css_value
            for (int i = 0; i < valueCtx.getChildCount(); i++) {
                if (i > 0) {
                    valueBuilder.append(" ");
                }
                valueBuilder.append(valueCtx.getChild(i).getText());
            }
            
            value = valueBuilder.toString().trim();
        }
        
        return new CssPropertyNode(name, value, line);
    }
}
