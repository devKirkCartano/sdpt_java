package main;

public class Product {
    String name;
    float price;

    Product(String name, float price) {
        this.name = name;
        this.price = price;

        System.out.println(name + " Created" + " with price " + price);
    }
}
