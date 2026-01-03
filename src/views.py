from flask import Flask, render_template, request, redirect, url_for
import json

app = Flask(__name__)


def load_products():
    with open("data/products.json", "r") as f:
        return json.load(f)["products"]


@app.route("/")
def index():
    return redirect(url_for("products"))


@app.route("/products")
def products():
    products = load_products()
    return render_template("products.html", products=products)


@app.route("/products/<int:id>")
def product_details(id):
    products = load_products()
    product = None
    for p in products:
        if p["id"] == id:
            product = p
            break

    if product is None:
        return redirect(url_for("products"))
    return render_template("product_details.html", product=product)

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000, debug=True)
