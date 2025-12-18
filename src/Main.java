import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("C:\\Users\\user\\Desktop\\compiler-web-interface-main\\compiler-web-interface-main\\src\\app.py");

        Lexer_CSS_Python lexer = new Lexer_CSS_Python(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        List<Token> allTokens = tokens.getTokens();
        for (Token token : allTokens) {
            System.out.println(
                    "Token: " + token.getText() +
                            "\tType: " + lexer.getVocabulary().getSymbolicName(token.getType()) +
                            "\tLine: " + token.getLine()
            );
        }
    }
}
