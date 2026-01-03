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
        
                // Parser
                Parser_HTML_Jinja_CSS parser = new Parser_HTML_Jinja_CSS(tokens);
                ParseTree tree = parser.document();
        
                // Visitor
                HTMLJinjaCSSVisitor visitor = new HTMLJinjaCSSVisitor();
                ASTNode ast = visitor.visit(tree);
        
                // Print AST
                if (ast != null) {
                    System.out.println("=== AST ===");
                    System.out.println(ast.toString());
                } else {
                    System.out.println("Failed to build AST.");
                }
    }
}