lexer grammar Lexer_HTML_Jinja;

tokens { IDENTIFIER }

/* =====================
   DEFAULT MODE (HTML TEXT)
===================== */

LT  : '<' -> pushMode(TAG) ;
JINJA_OPEN_EXPR : '{{' -> pushMode(JINJA) ;
JINJA_OPEN_STMT : '{%' -> pushMode(JINJA) ;
TEXT
    : (~[<{] | '{' ~[{%])+
    ;

WS : [ \t\r\n]+ -> type(TEXT) ;

/* =====================
   TAG MODE
===================== */

mode TAG;

GT     : '>' -> popMode ;
SLASH  : '/' ;
EQ     : '=' ;
TAG_IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]* -> type(IDENTIFIER) ;
STRING : '"' ~["]* '"' ;
ATTR_VALUE : [a-zA-Z0-9_.:-]+ ;
DOCTYPE
    : '!' ~[>]* '>' -> popMode
    ;
TAG_WS : [ \t\r\n]+ -> skip ;


/* =====================
   JINJA MODE
===================== */

mode JINJA;

JINJA_CLOSE_EXPR : '}}' -> popMode ;
JINJA_CLOSE_STMT : '%}' -> popMode ;

FOR : 'for' ;
IN  : 'in' ;
ENDFOR : 'endfor' ;
IF : 'if' ;
ENDIF : 'endif' ;
NOT : 'not' ;

DOT : '.' ;
JINJA_IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]* -> type(IDENTIFIER) ;

JINJA_WS : [ \t\r\n]+ -> skip ;
