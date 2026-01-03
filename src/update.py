from flask import Flask, render_template, request, redirect, url_for
import json

app = Flask(__name__)


def load_products():
    with open("data/products.json", "r") as f:
        return json.load(f)["products"]


def save_products(products):
    with open("data/products.json", "w") as f:
        json.dump({"products": products}, f, indent=4)


@app.route("/update/<int:id>", methods=["GET", "POST"])
def update(id):
    products = load_products()
    product = None
    for p in products:
        if p["id"] == id:
            product = p
            break

    if product is None:
        return redirect(url_for("products"))

    if request.method == "POST":
        product["name"] = request.form.get("name")
        product["price"] = request.form.get("price")
        product["description"] = request.form.get("description")
        product["image"] = request.form.get("image")
        save_products(products)
        return redirect(url_for("products"))
    
    return render_template("update_product.html", product=product)

