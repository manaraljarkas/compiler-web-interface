from flask import Flask, render_template, request, redirect, url_for
import json

app = Flask(__name__)

def load_products():
    with open("data/products.json", "r") as f:
        return json.load(f)["products"]

def save_products(products):
    with open("data/products.json", "w") as f:
        json.dump({"products": products}, f, indent=4)

@app.route("/add", methods=["GET", "POST"])
def add():
    if request.method == "POST":
        name = request.form.get("name")
        price = request.form.get("price")

        # --- السطر اللي كان ناقص ---
        products = load_products()

        # الكومبايلر هلا رح يشوف products معرفة نظامي ويمرقها
        for p in products:
            new_id = p["id"]

        # هون الكومبايلر رح يمسك p لأنها ماتت بنهاية حلقة الـ for
        #  print(p["name"])

        return redirect(url_for("products"))
    return render_template("add_product.html")

# --- تجربة إضافية للـ Scope Error في الدوال ---
def test_scope():
    inside_var = 100
