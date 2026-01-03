import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import visitor.HTMLJinjaCSSVisitor;
import ast.ASTNode;
import gen.Lexer_HTML_Jinja_CSS;
import gen.Parser_HTML_Jinja_CSS;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
                // قراءة ملف HTML
                CharStream input = CharStreams.fromFileName("frontend/templates/product_details.html", java.nio.charset.StandardCharsets.UTF_8);

                // Lexer
                Lexer_HTML_Jinja_CSS lexer = new Lexer_HTML_Jinja_CSS(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
        
                // Debug: Print first few tokens
                tokens.fill();
                System.out.println("=== Token Debug ===");
                for (int i = 0; i < Math.min(20, tokens.size()); i++) {
                    Token token = tokens.get(i);
                    String tokenName = lexer.getVocabulary().getSymbolicName(token.getType());
                    if (tokenName == null) {
                        tokenName = lexer.getVocabulary().getDisplayName(token.getType());
                    }
                    String text = token.getText().replace("\n", "\\n").replace("\r", "\\r");
                    System.out.println(i + ": [" + tokenName + "] = '" + text + "' (line " + token.getLine() + ")");
                }
                System.out.println();
        
                // Parser
                Parser_Python parser = new Parser_Python(tokens);
                parser.removeErrorListeners();
                parser.addErrorListener(new org.antlr.v4.runtime.BaseErrorListener() {
                    @Override
                    public void syntaxError(org.antlr.v4.runtime.Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            org.antlr.v4.runtime.RecognitionException e) {
                        System.err.println("Syntax Error at line " + line + ":" + charPositionInLine + " - " + msg);
                        if (offendingSymbol != null) {
                            System.err.println("  Offending token: " + offendingSymbol);
                        }
                        if (e != null && e.getOffendingToken() != null) {
                            Token token = e.getOffendingToken();
                            System.err.println("  Token type: " + lexer.getVocabulary().getSymbolicName(token.getType()));
                            System.err.println("  Token text: '" + token.getText() + "'");
                        }
                    }
                });
        
                System.out.println("Token stream size: " + tokens.size());
                System.out.println("Current token index: " + tokens.index());
                tokens.seek(0);
                System.out.println("First token after seek(0): " + tokens.LT(1));
                if (tokens.LT(1) != null) {
                    Token firstToken = tokens.LT(1);
                    String tokenName = lexer.getVocabulary().getSymbolicName(firstToken.getType());
                    System.out.println("Token type: " + tokenName + ", text: '" + firstToken.getText() + "'");
                }
                System.out.println("Attempting to parse...");
                ParseTree tree = parser.program();
                System.out.println("Parse successful!");
        
                // Visitor
                PythonASTVisitor visitor = new PythonASTVisitor();
                ASTNode ast = visitor.visit(tree);
                visitor.getSymbolTable().print();
        // Print AST
                if (ast != null) {
                    System.out.println("=== AST ===");
                    System.out.println(ast.toString());
                } else {
                    System.out.println("Failed to build AST.");
                }
    }
}