import errors.TypeMismatch;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import visitor.PythonASTVisitor;
import errors.ScopeError;
import errors.TypeError;
import errors.UndefinedSymbolError;
import ast.ASTNode;
import gen.Parser_Python;
import gen.Lexer_Python;

import errors.FlaskVariableError;
import visitor.HTMLJinjaCSSVisitor;
import gen.Parser_HTML_Jinja_CSS;
import gen.Lexer_HTML_Jinja_CSS;
import java.util.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            // قراءة ملف HTML
            // CharStream input =
            // CharStreams.fromFileName("frontend/templates/product_details.html",
            // java.nio.charset.StandardCharsets.UTF_8);
            CharStream input = CharStreams.fromFileName("src/app.py", java.nio.charset.StandardCharsets.UTF_8);

            // Lexer
            // Lexer_HTML_Jinja_CSS lexer = new Lexer_HTML_Jinja_CSS(input);
            Lexer_Python lexer = new Lexer_Python(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Debug: Print first few tokens
            tokens.fill();

            // Parser
            // Parser_HTML_Jinja_CSS parser = new Parser_HTML_Jinja_CSS(tokens);
            Parser_Python parser = new Parser_Python(tokens);

            ParseTree tree = parser.program();

            // Visitor
            // HTMLJinjaCSSVisitor visitor = new HTMLJinjaCSSVisitor();
            // PythonASTVisitor visitor = new PythonASTVisitor();
            // ASTNode ast = visitor.visit(tree);
            // System.out.println("Semantic Analysis Passed Successfully!");
            // System.out.println("\n\n\n");
            // System.out.println("=== SYMBOL TABLE ===");
            // visitor.getSymbolTable().print();

            PythonASTVisitor visitor = new PythonASTVisitor();
            ASTNode ast = null;

            try {
                ast = visitor.visit(tree);

                System.out.println("Semantic Analysis Passed Successfully!");
                System.out.println("\n\n\n");
                System.out.println("=== SYMBOL TABLE ===");
                visitor.getSymbolTable().print();

            } catch (UndefinedSymbolError | ScopeError e) {

                System.out.println("\n>>>> Scope / Undefined Error FOUND <<<<");
                System.out.println(e.getMessage());

            } catch (TypeError e) {

                System.out.println("\n>>>> Type Error FOUND <<<<");
                System.out.println(e.getMessage());

            }

            // flask
            // ── تحليل HTML templates ──
            Map<String, List<List<String>>> renderTemplateVars = visitor.getRenderTemplateVars();

            Map<String, String> templateFiles = new LinkedHashMap<>();
            templateFiles.put("products.html", "frontend/templates/products.html");
            templateFiles.put("product_details.html", "frontend/templates/product_details.html");
            templateFiles.put("add_product.html", "frontend/templates/add_product.html");

            Map<String, List<HTMLJinjaCSSVisitor.JinjaVarUsage>> htmlVarsMap = new LinkedHashMap<>();

            for (Map.Entry<String, String> entry : templateFiles.entrySet()) {
                String templateName = entry.getKey();
                String templatePath = entry.getValue();

                CharStream htmlInput = CharStreams.fromFileName(
                        templatePath, java.nio.charset.StandardCharsets.UTF_8);

                Lexer_HTML_Jinja_CSS htmlLexer = new Lexer_HTML_Jinja_CSS(htmlInput);
                CommonTokenStream htmlTokens = new CommonTokenStream(htmlLexer);
                htmlTokens.fill();

                Parser_HTML_Jinja_CSS htmlParser = new Parser_HTML_Jinja_CSS(htmlTokens);
                ParseTree htmlTree = htmlParser.document();

                HTMLJinjaCSSVisitor htmlVisitor = new HTMLJinjaCSSVisitor();
                htmlVisitor.setTemplateName(templateName);
                htmlVisitor.visit(htmlTree);

                List<HTMLJinjaCSSVisitor.JinjaVarUsage> jinjaVars = htmlVisitor.getJinjaVars();
                htmlVarsMap.put(templateName, jinjaVars);

                System.out.println("\n=== HTML: " + templateName + " ===");
                System.out.println("Jinja vars used: " + jinjaVars);
            }

            // ── المقارنة ──
            System.out.println("\n=== FLASK VARIABLE CHECK ===");
            for (Map.Entry<String, List<HTMLJinjaCSSVisitor.JinjaVarUsage>> entry : htmlVarsMap.entrySet()) {
                String templateName = entry.getKey();
                List<HTMLJinjaCSSVisitor.JinjaVarUsage> usedVars = entry.getValue();

                if (usedVars.isEmpty())
                    continue;

                if (!renderTemplateVars.containsKey(templateName)) {
                    throw new FlaskVariableError(templateName, usedVars.get(0).getLine());
                }

                // Every render_template() call site for this template gets its own
                // variable list — a used variable is fine as long as ANY call site sent it.
                List<List<String>> allSentVars = renderTemplateVars.get(templateName);
                for (HTMLJinjaCSSVisitor.JinjaVarUsage usedVar : usedVars) {
                    boolean foundInAnyCall = false;
                    for (List<String> sentVars : allSentVars) {
                        if (sentVars.contains(usedVar.getName())) {
                            foundInAnyCall = true;
                            break;
                        }
                    }
                    if (!foundInAnyCall) {
                        throw new FlaskVariableError(usedVar.getName(), templateName, usedVar.getLine());
                    }
                }
            }
            System.out.println("All Flask variables are correctly passed!");
            ///////////

            // Print AST
            if (ast != null) {
                System.out.println("=== AST ===");
                System.out.println(ast.toString());
            } else {
                System.out.println("Failed to build AST.");
            }

        } catch (UndefinedSymbolError | ScopeError e) {
            System.out.println("\n>>>> Scope / Undefined Error FOUND <<<<");
            System.out.println(e.getMessage());
        } catch (TypeError e) {
            System.err.println("\n>>>> Type Error FOUND <<<<");
            System.err.println(e.getMessage());
        } catch (TypeMismatch e) {
            System.err.println("\n>>>> Type Mismatch FOUND <<<<");
            System.err.println(e.getMessage());
        }

        //
        catch (FlaskVariableError e) {
            System.err.println("\n>>>> Flask Variable Error FOUND <<<<");
            System.err.println(e.getMessage());
        }
    }
}