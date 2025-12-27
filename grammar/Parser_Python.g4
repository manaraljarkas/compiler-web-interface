parser grammar Parser_Python;
options { tokenVocab=Lexer_Python; }

program: statement* EOF;

statement
    : import_statement        #ImportStmt
    | route                   #RouteStmt
    | function_defination     #FunctionDefStmt
    | assignment              #GlobalAssignmentStmt
    | if_statement            #GlobalIfStmt
    ;


//imports
import_statement: import_flask | import_json ;
import_flask: FROM CHARACTERS IMPORT CHARACTERS (COMMA CHARACTERS)* ;
import_json: IMPORT_JSON;

// def save_products(products):
function_defination:
    DEF CHARACTERS function_parameter Colon NEWLINE INDENT function_body DEDENT ;

function_body:
    statement_in_function* ;


statement_in_function
    : return_statement        #ReturnStmt
    | assignment              #AssignmentStmt
    | if_statement            #IfStmt
    | for_loop                #ForStmt
    | with_open               #WithStmt
    | function_call           #FunctionCallStmt
    | BREAK                   #BreakStmt
    ;

// def save_products(products):
function_parameter: OPEN_B set_function_parameter?  CLOSE_B;
set_function_parameter: CHARACTERS (COMMA CHARACTERS)*;


//  @app.route("/") @app.route("/products")
// @app.route("/add", methods=["GET", "POST"])
// @app.route("/products/<int:id>")
route: AT CHARACTERS DOT ROUTE route_parameter;
route_parameter: OPEN_B route_parameter_body CLOSE_B ;
route_parameter_body: STRING   | STRING COMMA route_parameter_options ;
route_parameter_options: CHARACTERS EQUAL array | CHARACTERS EQUAL CHARACTERS ;
array: LEFT_ARRAY array_items RIGHT_ARRAY ;
array_items: STRING (COMMA STRING)* ;



// return render_template("product_details.html", product=product)
// return redirect(url_for("products"))
// return json.load(f)["products"]
//  json.dump({"products": products}, f, indent=4)
return_statement: RETURN expression ;
function_call:  function_name OPEN_B argument_list? CLOSE_B ;
function_name: CHARACTERS (DOT CHARACTERS)* ;
argument_list: argument (COMMA argument)*;
argument: expression | key_value | curly_argument ;
key_value: (CHARACTERS | DEFAULT) EQUAL expression ;
function_array: function_call LEFT_ARRAY STRING RIGHT_ARRAY;
curly_argument: LEFT_CURLY curly_items? RIGHT_CURLY;
curly_items: curly_item (COMMA curly_item)* ;
curly_item: other_expression Colon other_expression;
expression:  other_expression | list;

other_expression:
    function_call
    | index_access
    | CHARACTERS
    | function_name
    | NUMBERS
    | STRING
    | function_array ;



// with open("data/products.json", "w") as f:
with_open: WITH OPEN OPEN_B with_parameter CLOSE_B AS CHARACTERS Colon;
with_parameter: STRING (COMMA STRING)*;


// products = load_products()
//  name = request.form.get("name")
//  price = request.form.get("price")
//  description = request.form.get("description")
//  image = request.form.get("image")
assignment: CHARACTERS EQUAL expression | CHARACTERS PLUSEQUAL expression  ;


//  if request.method == "POST":
// if product is None:
if_statement  : IF condition Colon NEWLINE INDENT statement_in_function* DEDENT ;
condition: expression comparison_operator expression ;
comparison_operator: NOT_EQUAL |IS | IS_NOT | EQUAL_EQUAL| RIGHT_ANGLE | LEFT_ANGLE  ;


// p["id"]
index_access: CHARACTERS LEFT_ARRAY STRING RIGHT_ARRAY ;

// for p in products
for_loop: FOR CHARACTERS IN CHARACTERS Colon NEWLINE INDENT statement_in_function* DEDENT;

list: LEFT_ARRAY   RIGHT_ARRAY #EmptyList |
     LEFT_ARRAY list_items  RIGHT_ARRAY #NonEmptyList ;
list_items: expression (COMMA expression)*  ;