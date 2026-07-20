from flask import Flask, render_template, request, redirect, url_for
import json

app = Flask(__name__)

def load_products():
    with open("data/products.json", "r") as f:
        return json.load(f)["products"]

def save_products(products):
    with open("data/products.json", "w") as f:
        json.dump({"products": products}, f, indent=4)
  app.route("/products")
def products():
    products = load_products()
    return render_template("products.html", products=products)

    @app.route("/products")
def users():
    users_list = load_users()
    return render_template("pro.html", users=users_list)
@app.route("/add", methods=["GET", "POST"])
def add():
    if request.method == "POST":
        name = request.form.get("name")
        price = request.form.get("price")

        products = load_products()

        for p in products:
            new_id = p["id"]

        # هون الكومبايلر رح يمسك p لأنها ماتت بنهاية حلقة الـ for
        #  print(p["name"])

        return redirect(url_for("products"))
    return render_template("add_product.html")
    @app.route("/products/<int:id>")
def product_details(id):
    products = load_products()
    product = None
    for p in products:
        if p["id"] == id:
            product = p
    return render_template("product_details.html", product=product)
# --- تجربة إضافية للـ Scope Error في الدوال ---
def test_scope():
    inside_var = 100


# // type error iterable case1  استدعاء متير غير قابل للتكرار ضمن حلقة//
#   def test_type_errors():
#     x = 5
#     for i in x:
#         y = 1
# def test_iter2():
#     b = True
#     for i in b:
#         y = 1

# // type error callable case2 استدعاء متغير كتابع //
# def test_type_errors():
#     lst = [1, 2, 3]
#     lst()
# /////////
 #    x = 5
    #  x()
    # /////////
#     s = "hello"
# s()
# /////////
# b = True
# b()
# /////////
# d = {"a": 1}
# d()
# /////////
# def foo(callback):
#     callback()   نجاح لانو مامنعرف المتغير هون تابع عنجد او لا 
# ////////////
# for item in [1, 2, 3]:
#     item()
# // end of callable //

# // type error wrong arg count case3 عدد برامتيرات غير صحصيح حسب توقيع الدالة //
# def test_type_errors():
#     greet("Ali")

# def greet(name, age):
    
    
#     return name
# def add_numbers(x, y):
#     return x + y

# def test_wrong_arg_count():
#     # add_numbers(1)
#     add_numbers(1, 2)
#     add_numbers(1, 2, 3)
# // type error Wrong FUNCTION_AS_VARIABLE case 4 استدعاء تابع على انه متغير //
# def greet(name):
#     return name

# greet = 5
#  // type errror wrong INVALID_ASSIGNMENT case 5 بتكشف لما تعيد تعيين متغير بنوع مختلف عن نوعه الأصلي //
# x = 5
# x = "hello"  
# x = 5
# x = 10
# def get_number():
#     return 5

# x = 5
# x = get_number()   تنجح 

# def get_text():
#     return "hi"

# x = 5
# x = get_text() تفشل 
#  x = True 
#  x = 10
#  // type error wrong WRONG_RETURN_TYPE case 6   بتكشف لما دالة وحدة بترجع أنواع مختلفة بأكتر من return statement: //
# def calculate():
#     return 5

# def calculate2(): error
#     return "hello"
#     return 10
# def calculate2(): error
#     return True
#     return 10

# def calc(flag): error
#     if flag:
#         return 5
#     return "hello"

# def calc(flag): success
#     if flag:
#         return 5
#     return 10

#  def get_value(x):  
#     return x         # return لـ parameter → نوعه الحقيقي unknown، ما لازم يسجل توقع
#     return "text