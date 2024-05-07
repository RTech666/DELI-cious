package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

class Sandwich {
    // Create variables, as private.
    private List<Meat> meats;
    private List<Cheese> cheeses;
    private List<Topping> toppings;
    private List<Sauce> sauces;
    private List<Side> sides;
    private boolean toasted;

    // Create the constructor.
    public Sandwich(String breadType, int size) {
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.sides = new ArrayList<>();
        this.toasted = false;
    }

    // Create setters.
    public void addMeat(Meat meat) {
        meats.add(meat);
    }

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void addSauce(Sauce sauce) {
        sauces.add(sauce);
    }

    public void addSide(Side side) {
        sides.add(side);
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
}