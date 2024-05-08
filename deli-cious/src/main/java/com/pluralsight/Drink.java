/* 
Drink.java
This Java file contains the base for the drinks.
*/

package com.pluralsight;

class Drink {
    // Create variables, as private.
    private String size;
    private String type;
    private double price;

    // Create the constructor.
    public Drink(String size, String type, double price) {
        this.size = size;
        this.type = type;
        this.price = price;
    }

    // Create getters.
    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}