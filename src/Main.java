import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import visitor.HTMLJinjaCSSVisitor;
import visitor.PythonASTVisitor;
import ast.ASTNode;
import gen.Lexer_HTML_Jinja_CSS;
import gen.Parser_HTML_Jinja_CSS;
import gen.Parser_Python;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
                // قراءة ملف HTML
                // CharStream input = CharStreams.fromFileName("frontend/templates/product_details.html", java.nio.charset.StandardCharsets.UTF_8);
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
                PythonASTVisitor visitor = new PythonASTVisitor();
                ASTNode ast = visitor.visit(tree);
                System.out.println("\n\n\n");
                System.out.println("=== SYMBOL TABLE ===");
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