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

  

