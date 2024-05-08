/* 
Topping.java
This Java file contains the base for the toppings.
*/

package com.pluralsight;

class Topping {
    // Create variable, as private.
    private String name;

    // Create the constructor.
    public Topping(String name) {
        this.name = name;
    }

    // Create getter.
    public String getName() {
        return name;
    }
}