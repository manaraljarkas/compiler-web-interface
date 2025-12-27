lexer grammar Lexer_Python;

@header {
import java.util.Stack;
import java.util.LinkedList;
import org.antlr.v4.runtime.*;
}

@members {
    Stack<Integer> indents = new Stack<>();
    LinkedList<Token> queue = new LinkedList<>();

void emitToken(int type) {
    CommonToken t = new CommonToken(
        new Pair<>(this, _input),
        type,
        DEFAULT_TOKEN_CHANNEL,
        _input.index(),
        _input.index() - 1   // empty token but VALID range
    );
    queue.add(t);
}


    int countSpaces(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') count++;
            else if (c == '\t') count += 4;
        }
        return count;
    }

    @Override
    public Token nextToken() {
        if (!queue.isEmpty()) {
            return queue.poll();
        }

        Token next = super.nextToken();

        if (next.getType() == NEWLINE) {
            String nlText = next.getText();
            int spaces = 0;

            // احسب المسافات بعد الـ NEWLINE
            for (int i = nlText.length() - 1; i >= 0; i--) {
                char c = nlText.charAt(i);
                if (c == ' ') spaces++;
                else if (c == '\t') spaces += 4;
                else break;
            }

            int prevIndent = indents.isEmpty() ? 0 : indents.peek();

            if (spaces > prevIndent) {
                indents.push(spaces);
                emitToken(INDENT);
            }
            else if (spaces < prevIndent) {
                while (!indents.isEmpty() && indents.peek() > spaces) {
                    indents.pop();
                    emitToken(DEDENT);
                }
            }
        }

        return next;
    }
}

/* ===== TOKENS ===== */

INDENT: ;
DEDENT: ;

NEWLINE: ('\r'? '\n') [ \t]*   ;

WS: [ \t]+ -> channel(HIDDEN);

// keywords
FROM: 'from';
IMPORT: 'import';
LOAD: 'LOAD';
DEF: 'def';
RETURN: 'return';
ROUTE: 'route';
INT: 'int';
FOR: 'for';
IN: 'in';
AS: 'as';
GET: 'GET';
POST: 'POST';
WITH: 'with';
OPEN: 'open';
IMPORT_JSON: 'import json';
IF: 'if';
IS: 'is';
IS_NOT: 'is not';
EQUAL_EQUAL: '==';
DEFAULT: 'default';
BREAK: 'break';

// symbols
COMMA: ',';
EQUAL: '=';
NOT_EQUAL: '!=';
OPEN_B: '(';
CLOSE_B: ')';
Colon: ':';
AT: '@';
DOT: '.';
LEFT_ANGLE: '<';
RIGHT_ANGLE: '>';
LEFT_ARRAY: '[';
RIGHT_ARRAY: ']';
LEFT_CURLY: '{';
RIGHT_CURLY: '}';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
PLUSEQUAL: '+=';

// literals
NUMBERS: [0-9]+;
CHARACTERS: [a-zA-Z_][a-zA-Z0-9_-]*;
STRING: '"' (~["\r\n])* '"';