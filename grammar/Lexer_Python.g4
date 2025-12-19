lexer grammar Lexer_Python;

@header {
import java.util.Stack;
import java.util.LinkedList;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonToken;
}

@members {
    Stack<Integer> indents = new Stack<>();
    LinkedList<Token> queue = new LinkedList<>();
    Token lastToken = null;

    void emitIndent() { queue.add(new CommonToken(INDENT, "<INDENT>")); }
    void emitDedent() { queue.add(new CommonToken(DEDENT, "<DEDENT>")); }

    int countSpaces(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') count++;
            else if (c == '\t') count += 4; // أو حسب convention
        }
        return count;
    }

    @Override
    public Token nextToken() {
        if (!queue.isEmpty()) return queue.poll();

        Token next = super.nextToken();

if (next.getType() == NEWLINE) {
    String after = getTextAfterNewline();
    int newIndent = countSpaces(after);
    int prevIndent = indents.isEmpty() ? 0 : indents.peek();

    if (newIndent > prevIndent) {
        indents.push(newIndent);
        emitIndent();
    } else if (newIndent < prevIndent) {
        while (!indents.isEmpty() && indents.peek() > newIndent) {
            indents.pop();
            emitDedent();
        }
    }
}


        lastToken = next;
        return queue.isEmpty() ? next : queue.poll();
    }

    String getTextAfterNewline() {
        int start = _input.index();
        int stop = start;

        while (_input.LA(1) == ' ' || _input.LA(1) == '\t') {
            _input.consume();
            stop++;
        }

        return _input.getText(new Interval(start, stop - 1));
    }
}

fragment INDENT_frag: ;
fragment DEDENT_frag: ;
INDENT: ;
DEDENT: ;


NEWLINE : '\r'? '\n';

// keywords
FROM: 'from';
IMPORT: 'import';
//FLASK: 'flask' | 'Flask';
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



// --- symbols ---
COMMA: ',';
QUOTES: '"';
EQUAL: '=';
NOT_EQUAL: '!=';
OPEN_B: '(';
CLOSE_B: ')';
Colon: ':';
AT: '@';
DOT: '.';
LEFT_ANGLE: '<';
RIGHT_ANGLE: '>';
RIGHT_ARRAY: ']';
LEFT_ARRAY: '[' ;
LEFT_CURLY: '{';
RIGHT_CURLY: '}';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
PLUSEQUAL: '+=';
//HASH: '#' ;


// literals
NUMBERS: [0-9]+;
CHARACTERS: [a-zA-Z_][a-zA-Z0-9_-]*;
STRING: '"' (~["\r\n])* '"';


WS: [ \t]+ -> channel(HIDDEN);
