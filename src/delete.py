from flask import Flask, render_template, request, redirect, url_for
import json

app = Flask(__name__)


def load_products():
    with open("data/products.json", "r") as f:
        return json.load(f)["products"]


def save_products(products):
    with open("data/products.json", "w") as f:
        json.dump({"products": products}, f, indent=4)


@app.route("/delete/<int:id>")
def delete(id):
    products = load_products()
    new_products = []
    for p in products:
        if p["id"] != id:
            new_products.append(p)
    products = new_products


    save_products(products)
    return redirect(url_for("products"))

