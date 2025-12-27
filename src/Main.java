import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // قراءة ملف Python
        CharStream input = CharStreams.fromFileName("frontend/app.py");

        // Lexer
        Lexer_Python lexer = new Lexer_Python(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Parser
        Parser_Python parser = new Parser_Python(tokens);

        ParseTree tree = parser.program();

    }
}