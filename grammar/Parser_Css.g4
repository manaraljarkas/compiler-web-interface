parser grammar Parser_Css;
options { tokenVocab=Lexer_Css; }

program: statement* EOF;
statement: css_definition #CssStmt;

css_definition: STYLE_O style_body* STYLE_C;
style_body: css_header LEFT_CURLY style_content* RIGHT_CURLY ;
css_header: colon |CHARACTERS   | DOT CHARACTERS ;
colon: CHARACTERS COLON CHARACTERS;
style_content: property COLON value SEMICOLON;
property: CHARACTERS ;
value: value_items (COMMA value_items)* ;

value_items: (CHARACTERS | NUMBERS | NUMBERS UNIT | COLOR | STRING )+ ;

