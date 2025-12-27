from flask import Flask, render_template, request, redirect, url_for
import json

app = Flask(__name__)


def load_products():
    with open("data/products.json", "r") as f:
        return json.load(f)["products"]


def save_products(products):
    with open("data/products.json", "w") as f:
        json.dump({"products": products}, f, indent=4)


@app.route("/")
def index():
    return redirect(url_for("products"))



@app.route("/products")
def products():
    products = load_products()
    return render_template("products.html", products=products)


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


if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000, debug=True)
