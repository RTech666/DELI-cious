/* 
side.java
This Java file contains the base for the sides.
*/

package com.pluralsight;

class Side {
    // Create variable, as private.
    private String name;

    // Create the constrcutor.
    public Side(String name) {
        this.name = name;
    }

    // Create getter.
    public String getName() {
        return name;
    }
}