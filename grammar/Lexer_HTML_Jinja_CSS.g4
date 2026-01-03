lexer grammar Lexer_HTML_Jinja_CSS;

@header {
}

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
STYLE_OPEN
    : '<style>' -> pushMode(CSS)
    ;
STYLE_CLOSE
    : '</style>'
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


/* =====================
   CSS MODE
===================== */

mode CSS;

CSS_STYLE_CLOSE
    : '</style>' -> popMode
    ;

LEFT_CURLY  : '{' ;
RIGHT_CURLY : '}' ;
COLON       : ':' ;
SEMICOLON   : ';' ;
COMMA       : ',' ;
CSS_DOT         : '.' ;

COLOR
    : '#' [0-9a-fA-F]+
    ;

UNIT
    : 'px' | 'em' | 'rem' | '%'
    ;

NUMBERS
    : [0-9]+
    ;

CSS_STRING
    : '"' ~["]* '"'
    ;

CHARACTERS
    : [a-zA-Z_-][a-zA-Z0-9_-]*
    ;

CSS_WS
    : [ \t\r\n]+ -> skip
    ;