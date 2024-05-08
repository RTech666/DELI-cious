/* 
Philly.java
This Java file contains the Philly signature sandwich constructor.
*/

package com.pluralsight;

public class Philly extends Sandwich {
    public Philly() {
        super("White", 8);
        addMeat(new Meat("Steak", true, 1, 2, 3));
        addCheese(new Cheese("American"));
        addTopping(new Topping("Peppers"));
        addSauce(new Sauce("Mayo"));
        setToasted(true);
    }
}