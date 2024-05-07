package com.pluralsight;

class Drink {
    // Create variables, as private.
    private String size;
    private String type;

    // Create the constructor.
    public Drink(String size, String type) {
        this.size = size;
        this.type = type;
    }

    // Create getters.
    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}