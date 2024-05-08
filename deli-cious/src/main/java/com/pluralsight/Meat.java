package com.pluralsight;

class Meat {
    // Create variables, as private.
    private String name;
    private boolean premium;
    private double price4Inch;
    private double price8Inch;
    private double price12Inch;
    private boolean extra;

    // Create the constructor.
    public Meat(String name, boolean premium, double price4Inch, double price8Inch, double price12Inch) {
        this.name = name;
        this.premium = premium;
        this.price4Inch = price4Inch;
        this.price8Inch = price8Inch;
        this.price12Inch = price12Inch;
    }

    // Create getters.
    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return premium;
    }

    public double getPrice(int size) {
        switch (size) {
            case 4:
                return price4Inch;
            case 8:
                return price8Inch;
            case 12:
                return price12Inch;
            default:
                throw new IllegalArgumentException("Invalid size: " + size);
        }
    }

    public boolean isExtra() {
        return extra;
    }
}
