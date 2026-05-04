lexer grammar Lexer_Python;
tokens {
    INDENT,
    DEDENT
}

@lexer::members {
    java.util.Queue<Token> tokenQueue = new java.util.LinkedList<Token>();
    java.util.Stack<Integer> indentLevels = new java.util.Stack<Integer>();
    {
        indentLevels.push(0);
    }
    @Override
    public void emit(Token t) {
       super.setToken(t);
        tokenQueue.add(t);
    }
    @Override
    public Token nextToken() {
        if (!tokenQueue.isEmpty()) {
            return tokenQueue.poll();
        }
        Token next = super.nextToken();
        if (next.getType() == EOF && !indentLevels.isEmpty() && indentLevels.peek() > 0) {
            while (indentLevels.size() > 1) {
                emit(new CommonToken(DEDENT, "DEDENT"));
                indentLevels.pop();
            }
            emit(next);
            return tokenQueue.poll();
        }
        if (!tokenQueue.isEmpty()) {
            return tokenQueue.poll();
        }
        return next;
    }
}
NEWLINE
    : ('\r'? '\n')+
      {
          emit(new CommonToken(NEWLINE, "\n"));

          int spaces = 0;
          int c = _input.LA(1);

          while (c == ' ' || c == '\t') {
              if (c == '\t') spaces += 4;
              else spaces++;

              _input.consume();
              c = _input.LA(1);
          }

          int lastIndent = indentLevels.peek();

          if (spaces > lastIndent) {

              indentLevels.push(spaces);
              emit(new CommonToken(INDENT, "INDENT"));
          }
          else if (spaces < lastIndent) {
              while (spaces < indentLevels.peek()) {
                  indentLevels.pop();
                  emit(new CommonToken(DEDENT, "DEDENT"));
              }
          }
          skip();
      }
    ;
SP      : [ \t]+ -> skip ;
COMMENT: '#' ~('\n'|'\r')* ->skip;


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
IF: 'if';
IS: 'is';
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