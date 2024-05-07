package com.pluralsight;

class Chips {
    // Create variables, as private.
    private String type;
    private double price;

    // Create constructor.
    public Chips(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // Create getter for type.
    public String getType() {
        return type;
    }

    // Create getter for price.
    public double getPrice() {
        return price;
    }
}