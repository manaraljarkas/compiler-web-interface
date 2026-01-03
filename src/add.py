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
        description = request.form.get("description")
        image = request.form.get("image")
        products = load_products()
        new_id = 0
        for p in products:
            if p["id"] > new_id:
                new_id = p["id"]
        new_id += 1

        products.append({
            "id": new_id,"name": name,"price": price,
            "description": description,"image": image
        })
        save_products(products)
        return redirect(url_for("products"))
    return render_template("add_product.html")

