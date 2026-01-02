import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import visitor.PythonASTVisitor;
import visitor.HTMLJinjaCSSVisitor;
import ast.ast_Python.ProgramNode;
import ast.ast_html_css_jinja.DocumentNode;
import ast.ASTNode;
import gen.Lexer_Python;
import gen.Parser_Python;
import gen.Lexer_HTML_Jinja_CSS;
import gen.Parser_HTML_Jinja_CSS;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage: java Main <file_path>");
            return;
        }
        
        String filePath = args[0];
        String fileName = filePath.toLowerCase();
        
        CharStream input = CharStreams.fromFileName(filePath);
        ASTNode ast = null;
        
        if (fileName.endsWith(".py")) {
            // Parse Python file
            Lexer_Python lexer = new Lexer_Python(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Parser_Python parser = new Parser_Python(tokens);
            ParseTree tree = parser.program();
            
            // Build AST using visitor
            PythonASTVisitor visitor = new PythonASTVisitor();
            ast = visitor.visit(tree);
            
        } else if (fileName.endsWith(".html")) {
            // Parse HTML file
            Lexer_HTML_Jinja_CSS lexer = new Lexer_HTML_Jinja_CSS(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Parser_HTML_Jinja_CSS parser = new Parser_HTML_Jinja_CSS(tokens);
            ParseTree tree = parser.document();
            
            // Build AST using visitor
            HTMLJinjaCSSVisitor visitor = new HTMLJinjaCSSVisitor();
            ast = visitor.visit(tree);
        } else {
            System.out.println("Unsupported file type. Please provide a .py or .html file.");
            return;
        }
        
        // Print AST
        if (ast != null) {
            System.out.println("=== AST ===");
            System.out.println(ast.toString());
        } else {
            System.out.println("Failed to build AST.");
        }
    }
}