package com.mycompany.fer_main;

public class Package {
    private String name;
    private double price;

    public Package(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - Price: $" + price;
    }
}
