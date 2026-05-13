parser grammar Parser_Python;

@header {
}

options { tokenVocab=Lexer_Python; }


program: (statement | NEWLINE)* EOF;

statement
    : import_statement        #ImportStmt
    | route                   #RouteStmt
    | function_defination     #FunctionDefStmt
    | assignment              #GlobalAssignmentStmt
    | if_statement            #GlobalIfStmt
    ;


//imports
import_statement: import_flask | import_json ;
import_flask: FROM CHARACTERS IMPORT CHARACTERS (COMMA CHARACTERS)* (NEWLINE | EOF) ;
import_json: IMPORT CHARACTERS NEWLINE?;

// def save_products(products):
function_defination:
    DEF CHARACTERS function_parameter Colon NEWLINE INDENT function_body DEDENT ;

function_body: (NEWLINE | statement_in_function)* ;


statement_in_function
    : return_statement        #ReturnStmt
    | function_call           #FunctionCallStmt
    | assignment              #AssignmentStmt
    | if_statement            #IfStmt
    | for_loop                #ForStmt
    | with_open               #WithStmt
    | BREAK                   #BreakStmt
    ;

// def save_products(products):
function_parameter: OPEN_B set_function_parameter?  CLOSE_B;
set_function_parameter: CHARACTERS (COMMA CHARACTERS)*;


//  @app.route("/") @app.route("/products")
// @app.route("/add", methods=["GET", "POST"])
// @app.route("/products/<int:id>")
route: AT CHARACTERS DOT ROUTE route_parameter NEWLINE?;
route_parameter: OPEN_B route_parameter_body CLOSE_B ;
route_parameter_body: STRING   | STRING COMMA route_parameter_options ;
route_parameter_options: CHARACTERS EQUAL array | CHARACTERS EQUAL CHARACTERS ;
array: LEFT_ARRAY array_items RIGHT_ARRAY ;
array_items: STRING (COMMA STRING)* ;



// return render_template("product_details.html", product=product)
// return redirect(url_for("products"))
// return json.load(f)["products"]
//  json.dump({"products": products}, f, indent=4)
return_statement: RETURN expression NEWLINE? ;
function_call: function_name OPEN_B (NEWLINE)* argument_list? (NEWLINE)* CLOSE_B ;
function_name: CHARACTERS (DOT CHARACTERS)* ;
argument_list: argument (COMMA (NEWLINE* argument))*;
argument: key_value | expression ;
key_value: (CHARACTERS | DEFAULT) EQUAL expression ;
function_array: function_call LEFT_ARRAY STRING RIGHT_ARRAY;
curly_argument: LEFT_CURLY curly_items? RIGHT_CURLY;
curly_items: curly_item (COMMA (NEWLINE* curly_item))* ;
curly_item: (STRING | CHARACTERS) Colon expression;
expression
    : expression (MUL | DIV) expression           #ArithmeticExpr
    | expression (PLUS | MINUS) expression         #ArithmeticExpr
    | expression comparison_operator expression    #ComparisonExpr
    | OPEN_B expression CLOSE_B                   #ParenExpr
    | other_expression                             #AtomExpr
    | list                                         #ListExpr
    | curly_argument                               #DictExpr
    ;

other_expression
    : function_array
    | index_access
    | function_call
    | CHARACTERS
    | function_name
    | NUMBERS
    | STRING
    ;


// with open("data/products.json", "w") as f:
with_open: WITH OPEN OPEN_B with_parameter CLOSE_B AS CHARACTERS Colon NEWLINE INDENT (NEWLINE | statement_in_function)+ DEDENT;
with_parameter: STRING (COMMA STRING)*;


// products = load_products()
//  name = request.form.get("name")
//  price = request.form.get("price")
//  description = request.form.get("description")
//  image = request.form.get("image")
assignment: CHARACTERS EQUAL expression NEWLINE? | CHARACTERS PLUSEQUAL expression NEWLINE? ;


//  if request.method == "POST":
// if product is None:
if_statement : IF expression Colon NEWLINE INDENT (NEWLINE | statement_in_function)* DEDENT ;
comparison_operator: NOT_EQUAL |IS | IS_NOT | EQUAL_EQUAL| RIGHT_ANGLE | LEFT_ANGLE  ;


// p["id"] or json.load(f)["products"] - note: function_array handles function_call[...] case
index_access: CHARACTERS LEFT_ARRAY STRING RIGHT_ARRAY ;

// for p in products
for_loop: FOR CHARACTERS IN CHARACTERS Colon NEWLINE INDENT (NEWLINE | statement_in_function)* DEDENT;

list: LEFT_ARRAY   RIGHT_ARRAY #EmptyList |
     LEFT_ARRAY list_items  RIGHT_ARRAY #NonEmptyList ;
list_items: expression (COMMA expression)*  ;