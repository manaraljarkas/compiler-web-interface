parser grammar Parser_HTML_Jinja;

options { tokenVocab=Lexer_HTML_Jinja; }

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


/* =====================
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
