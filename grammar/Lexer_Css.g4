lexer grammar Lexer_Css;

STYLE_O: '<style>';
STYLE_C: '</style>';

DOT: '.';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
LEFT_CURLY: '{';
RIGHT_CURLY: '}';

UNIT: 'px' | '%' | 'em' | 'rem';
CHARACTERS: [a-zA-Z_][a-zA-Z0-9_-]*;
NUMBERS: [0-9]+;
STRING: '"' (~["\r\n])* '"';



COLOR: '#' [0-9a-fA-F]+;

WS: [ \t\r\n]+ -> channel(HIDDEN);
