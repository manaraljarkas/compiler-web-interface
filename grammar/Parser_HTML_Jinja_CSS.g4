parser grammar Parser_HTML_Jinja_CSS;

options { tokenVocab=Lexer_HTML_Jinja_CSS; }

/* =====================
   ROOT
===================== */

document
    : node* EOF
    ;

/* =====================
   NODES
===================== */

node
    : doctype            #DoctypeNode
    | htmlElement        #HtmlNode
    | htmlVoidElement    #VoidElements_img_input_br_hr
    | styleElement       #StyleNode
    | jinjaStatement    #JinjaStmtNode
    | jinjaExpression   #JinjaExprNode
    | TEXT              #TextNode
    ;

/* =====================
   HTML
===================== */

htmlElement
    : LT IDENTIFIER (IDENTIFIER (EQ (STRING | ATTR_VALUE))?)* GT
      node*
      LT SLASH IDENTIFIER GT
    ;

doctype
    : LT DOCTYPE
    ;
styleElement
    : STYLE_OPEN css_rule* CSS_STYLE_CLOSE
    ;
htmlVoidElement
    : LT IDENTIFIER (IDENTIFIER (EQ (STRING | ATTR_VALUE))?)* GT
    ;



/* ====================
   JINJA
===================== */

jinjaStatement
    : jinjaForStatement
    | jinjaIfStatement
    ;

jinjaForStatement
    : JINJA_OPEN_STMT FOR IDENTIFIER IN IDENTIFIER JINJA_CLOSE_STMT
      node*
      JINJA_OPEN_STMT ENDFOR JINJA_CLOSE_STMT
    ;

jinjaIfStatement
    : JINJA_OPEN_STMT IF ifCondition JINJA_CLOSE_STMT
      node*
      JINJA_OPEN_STMT ENDIF JINJA_CLOSE_STMT
    ;

ifCondition
    : NOT? IDENTIFIER (DOT IDENTIFIER)*
    ;

jinjaExpression
    : JINJA_OPEN_EXPR IDENTIFIER (DOT IDENTIFIER)* JINJA_CLOSE_EXPR
    ;

/* =====================
   CSS
   Handles only inline <style> blocks inside HTML
===================== */

css_rule
    : css_selector LEFT_CURLY css_property* RIGHT_CURLY
    ;

css_selector
    : CHARACTERS
    | CHARACTERS COLON CHARACTERS   // a:hover
    | CSS_DOT CHARACTERS
    ;

css_property
    : CHARACTERS COLON css_value SEMICOLON
    ;

css_value
    : (CHARACTERS | NUMBERS | UNIT | COLOR | CSS_STRING | COMMA)+
    ;
