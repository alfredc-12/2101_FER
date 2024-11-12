package com.mycompany.fer_main;

public class Equipments {
    private String name;
    private String category;
    private double price;

    public Equipments(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - $" + price;
    }
}
