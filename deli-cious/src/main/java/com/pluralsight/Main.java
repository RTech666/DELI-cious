package com.pluralsight;
import java.util.Scanner;

public class Main {
    // Initalize the scanner.
    static Scanner scanner = new Scanner(System.in);

    // Create the variables.
    static Sandwich sandwich;
    static Order order = new Order();
    static int size;

    public static void main(String[] args) {
        int choice;
        do {
            // Print home screen.
            System.out.println("Home Screen:");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            // Ask user for their choice.
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Read the user input and execute the appropriate method.
            switch (choice) {
                case 1:
                    handleNewOrder(scanner, order);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (choice != 0);
    }

    // Create handleNewOrder method.
    private static void handleNewOrder(Scanner scanner, Order order) {
        int choice;
        do {
            // Print order screen.
            System.out.println("Order Screen:");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            // Ask user for their choice.
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Read the user input and execute the appropriate method.
            switch (choice) {
                case 1:
                    addSandwich(scanner, order);
                    break;
                case 2:
                    addDrink(scanner, order);
                    break;
                case 3:
                    addChips(scanner, order);
                    break;
                case 4:
                    
                    break;
                case 0:
                    System.out.println("Order canceled.");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (choice != 0 && choice != 4);
    }

    // Create addSandwich method.
    private static void addSandwich(Scanner scanner, Order order) {
        // Print bread options.
        System.out.println("Adding Sandwich:");
        System.out.println("Select your bread:");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");

        // Ask user for their choice.
        System.out.print("Enter your choice: ");
        int breadChoice = scanner.nextInt();

        String breadType;
        // Read the user input and execute the appropriate method.
        switch (breadChoice) {
            case 1:
                breadType = "White";
                break;
            case 2:
                breadType = "Wheat";
                break;
            case 3:
                breadType = "Rye";
                break;
            case 4:
                breadType = "Wrap";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to White bread.");
                breadType = "White";
        }
        
        // Ask user to enter the size they want.
        System.out.print("Enter sandwich size (4, 8, or 12 inches): ");
        size = scanner.nextInt();
        
        // Set sandwich bread and size.
        sandwich = new Sandwich(breadType, size);
    
        // Call meatChoice method.
        meatChoice();
    
        // Call cheeseChoice method.
        cheeseChoice();

        // Call toppingChoice method.
        toppingChoice();
    
        // Call sauceChoice method.
        sauceChoice();
    
        // Call sideChoice method.
        sideChoice();
    
        // Ask user if they want it toasted.
        System.out.print("Do you want the sandwich toasted? (Yes/No): ");
        String toastedChoice = scanner.next().toLowerCase();
        sandwich.setToasted(toastedChoice.equals("yes"));
    
        // Add the sandwich to the order
        order.addSandwich(sandwich);
        
        // Print success message.
        System.out.println("Sandwich added to the order.");
    }

    public static void meatChoice() {
        // Print meat menu.
        System.out.println("Select your meat:");
        System.out.println("1) Steak");
        System.out.println("2) Ham");
        System.out.println("3) Salami");
        System.out.println("4) Roast Beef");
        System.out.println("5) Chicken");
        System.out.println("6) Bacon");

        // Ask user for their choice.
        System.out.print("Enter your choices: ");
        scanner.nextLine();
        int meatInput = scanner.nextInt();

        // Read the user input and execute the appropriate method.
        switch(meatInput) {
            case 1:
                sandwich.addMeat(new Meat("Steak", true, 1, 2, 3));
                break;
            case 2:
                sandwich.addMeat(new Meat("Ham", true, 1, 2, 3));
                break;
            case 3:
                sandwich.addMeat(new Meat("Salami", true, 1, 2, 3));
                break;
            case 4:
                sandwich.addMeat(new Meat("Roast Beef", true, 1, 2, 3));
                break;
            case 5:
                sandwich.addMeat(new Meat("Chicken", true, 1, 2, 3));
                break;
            case 6:
                sandwich.addMeat(new Meat("Bacon", true, 1, 2, 3));
                break;
            default:
                System.out.println("Invalid input.");
        }
    
        // Ask user if they want extra meat.
        System.out.print("Do you want extra meat? (Yes/No): ");
        scanner.nextLine();
        String extraMeatChoice = scanner.nextLine().toLowerCase();
        double extraMeatCost = 0;
        // Read the user input and execute the appropriate method.
        if (extraMeatChoice.equals("yes")) {
            // Calculate extra meat cost based on size.
            switch (size) {
                case 4:
                    extraMeatCost = 0.50;
                    break;
                case 8:
                    extraMeatCost = 1;
                    break;
                case 12:
                    extraMeatCost = 1.50;
                    break;
                default:
                    System.out.println("Invalid sandwich size.");
                    return;
            }
        }
    }

    public static void cheeseChoice() {
        // Print cheese options.
        System.out.println("Select your cheese:");
        System.out.println("1) American");
        System.out.println("2) Provolone");
        System.out.println("3) Cheddar");
        System.out.println("4) Swiss");
    
        // Ask user for their choice.
        System.out.print("Enter your choice: ");
        int cheeseChoice = scanner.nextInt();
        scanner.nextLine();
    
        // Read the user input and execute the appropriate method.
        switch (cheeseChoice) {
            case 1:
                sandwich.addCheese(new Cheese("American", true, 0.75, 1.50, 2.25));
                break;
            case 2:
                sandwich.addCheese(new Cheese("Provolone", true, 0.75, 1.50, 2.25));
                break;
            case 3:
                sandwich.addCheese(new Cheese("Cheddar", true, 0.75, 1.50, 2.25));
                break;
            case 4:
                sandwich.addCheese(new Cheese("Swiss", true, 0.75, 1.50, 2.25));
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
    
        // Ask user if they want extra cheese.
        System.out.print("Do you want extra cheese? (Yes/No): ");
        String extraCheeseChoice = scanner.nextLine().toLowerCase();
        double extraCheeseCost = 0;
        // Read the user input and execute the appropriate method.
        if (extraCheeseChoice.equals("yes")) {
            // Calculate extra cheese cost based on size.
            switch (size) {
                case 4:
                    extraCheeseCost = 0.50;
                    break;
                case 8:
                    extraCheeseCost = 1;
                    break;
                case 12:
                    extraCheeseCost = 1.50;
                    break;
                default:
                    System.out.println("Invalid sandwich size.");
                    return;
            }
        }
    }

    public static void toppingChoice() {
        // Print topping options.
        System.out.println("Select your toppings (separate each topping with a comma):");
        System.out.println("1) Lettuce");
        System.out.println("2) Peppers");
        System.out.println("3) Onions");
        System.out.println("4) Tomatoes");
        System.out.println("5) Jalepenos");
        System.out.println("6) Cucumbers");
        System.out.println("7) Pickles");
        System.out.println("8) Guacamole");
        System.out.println("9) Mushrooms");
    
        // Ask user for their choice.
        System.out.print("Enter your choices: ");
        String toppingInput = scanner.nextLine(); // Read the whole line
    
        // Split the input by commas and trim each topping
        String[] toppings = toppingInput.split(",");
        
        // Read the user input and execute the appropriate method(s).
        for (String topping : toppings) {
            switch (topping.trim().toLowerCase()) {
                case "lettuce":
                    sandwich.addTopping(new Topping("Lettuce"));
                    break;
                case "peppers":
                    sandwich.addTopping(new Topping("Peppers"));
                    break;
                case "onions":
                    sandwich.addTopping(new Topping("Onions"));
                    break;
                case "tomatoes":
                    sandwich.addTopping(new Topping("Tomatoes"));
                    break;
                case "jalepenos":
                    sandwich.addTopping(new Topping("Jalepenos"));
                    break;
                case "cucumbers":
                    sandwich.addTopping(new Topping("Cucumbers"));
                    break;
                case "pickles":
                    sandwich.addTopping(new Topping("Pickles"));
                    break;
                case "guacamole":
                    sandwich.addTopping(new Topping("Guacamole"));
                    break;
                case "mushrooms":
                    sandwich.addTopping(new Topping("Mushrooms"));
                    break;
                default:
                    System.out.println("Invalid topping choice: " + topping.trim());
            }
        }
    }

    public static void sauceChoice() {
        // Print sauce options.
        System.out.println("Select your sauce:");
        System.out.println("1) Mayo");
        System.out.println("2) Mustard");
        System.out.println("3) Ketchup");
        System.out.println("4) Ranch");
        System.out.println("5) Thousand Islands");
        System.out.println("6) Vinaigrette");

        // Ask user for their choice. 
        System.out.print("Enter your choices: ");
        int sauceInput = scanner.nextInt();

        // Read the user input and execute the appropriate method.
        switch (sauceInput) {
            case 1:
                sandwich.addSauce(new Sauce("Mayo"));
                break;
            case 2:
                sandwich.addSauce(new Sauce("Mustard"));
                break;
            case 3:
                sandwich.addSauce(new Sauce("Ketchup"));
                break;
            case 4:
                sandwich.addSauce(new Sauce("Ranch"));
                break;
            case 5:
                sandwich.addSauce(new Sauce("Thousand Islands"));
                break;
            case 6:
                sandwich.addSauce(new Sauce("Vinaigrette"));
                break;
            default:
                System.out.println("Invalid sauce choice:");
        }

        return;
    }

    public static void sideChoice() {
        // Print side options.
        System.out.println("Select your side:");
        System.out.println("1) Au Jus");
        System.out.println("2) Sauce");

        // Ask user for their choice.
        System.out.print("Enter your choices: ");
        int sideInput = scanner.nextInt();
        
        // Read the user input and execute the appropriate method.
        switch (sideInput) {
            case 1:
                order.addSide(new Side("Au Jus"));
                break;
            case 2:
                order.addSide(new Side("Sauce"));
                break;
            default:
                System.out.println("Invalid side choice:");
        }

        return;
    }

    public static void addDrink(Scanner scanner, Order order) {
        // Prompt for drink size
        System.out.println("Select drink size:");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.print("Enter your choice: ");
        int sizeChoice = scanner.nextInt();
        String size;
        switch (sizeChoice) {
            case 1:
                size = "Small";
                break;
            case 2:
                size = "Medium";
                break;
            case 3:
                size = "Large";
                break;
            default:
                System.out.println("Invalid size choice. Drink not added.");
                return;
        }
    
        // Prompt for drink type
        System.out.println("Select drink type:");
        System.out.println("1) Cola");
        System.out.println("2) Lemonade");
        System.out.println("3) Iced Tea");
        System.out.print("Enter your choice: ");
        int drinkChoice = scanner.nextInt();
        String drinkType;
        switch (drinkChoice) {
            case 1:
                drinkType = "Cola";
                break;
            case 2:
                drinkType = "Lemonade";
                break;
            case 3:
                drinkType = "Iced Tea";
                break;
            default:
                System.out.println("Invalid drink choice. Drink not added.");
                return;
        }
    
        // Add the selected drink to the order
        Drink drink = new Drink(size, drinkType);
        order.addDrink(drink);
        System.out.println("Drink added to the order: " + size + " " + drinkType);
    }

    public static void addChips(Scanner scanner, Order order) {
        // Prompt for chip type
        System.out.println("Select chip type:");
        System.out.println("1) Regular");
        System.out.println("2) BBQ");
        System.out.println("3) Sour Cream & Onion");
        System.out.println("4) Salt & Vinegar");
        System.out.print("Enter your choice: ");
        int chipChoice = scanner.nextInt();
        String chipType;
        switch (chipChoice) {
            case 1:
                chipType = "Regular";
                break;
            case 2:
                chipType = "BBQ";
                break;
            case 3:
                chipType = "Sour Cream & Onion";
                break;
            case 4:
                chipType = "Salt & Vinegar";
                break;
            default:
                System.out.println("Invalid chip choice. Chips not added.");
                return;
        }
    
        // Add the selected chips to the order
        Chips chips = new Chips(chipType);
        order.addChips(chips);
        System.out.println("Chips added to the order: " + chipType);
    }
}