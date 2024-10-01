# FactoryPattern

## Overview

The Factory Design Pattern is another useful pattern in software development, especially when you want to create objects without having to specify the exact class of object that will be created. This is great for your JavaFX school cafeteria POS project when you need to dynamically create different types of objects, like menu items, orders, or even UI components.

## Basic Idea of the Factory Pattern:

  - **Factory**: A class that creates objects.
  - **Product**: The objects that the factory creates.

The Factory Pattern allows you to centralize object creation and make it flexible to create different types of related objects without needing to change your code every time.

## Use Case in Your JavaFX Cafeteria POS Project:

Imagine you have different types of menu items, such as Beverage, MainCourse, and Dessert. You want to create these items dynamically based on user input (e.g., when a cashier adds an item to an order).

## Steps to Implement the Factory Pattern in Your JavaFX Project:

   1. Create a Product Interface (for menu items).
   2. Create Concrete Product Classes (like Beverage, MainCourse, Dessert).
   3. Create a Factory Class (to generate the correct type of menu item).
   4. Use the Factory to Create Menu Items.

## Here’s a simple example:
  1. Create a Product Interface (or Abstract Class):

  This interface represents the general concept of a MenuItem.

    public interface MenuItem {
        String getName();
        double getPrice();
    }

  2. Create Concrete Product Classes:

  These are the specific types of menu items you want to create, like Beverage, MainCourse, and Dessert.

    public class Beverage implements MenuItem {
      private String name;
      private double price;
  
      public Beverage(String name, double price) {
          this.name = name;
          this.price = price;
      }
  
      @Override
      public String getName() {
          return this.name;
      }
  
      @Override
      public double getPrice() {
          return this.price;
      }
    }

    public class MainCourse implements MenuItem {
      private String name;
      private double price;
  
      public MainCourse(String name, double price) {
          this.name = name;
          this.price = price;
      }
  
      @Override
      public String getName() {
          return this.name;
      }
  
      @Override
      public double getPrice() {
          return this.price;
      }
    }

    public class Dessert implements MenuItem {
      private String name;
      private double price;
  
      public Dessert(String name, double price) {
          this.name = name;
          this.price = price;
      }
  
      @Override
      public String getName() {
          return this.name;
      }
  
      @Override
      public double getPrice() {
          return this.price;
      }
    }



  3. Create a Factory Class:

  This factory will create different menu items based on the type.

    public class MenuItemFactory {
        // Factory method to create menu items
        public static MenuItem createMenuItem(String type, String name, double price) {
            switch (type.toLowerCase()) {
                case "beverage":
                    return new Beverage(name, price);
                case "maincourse":
                    return new MainCourse(name, price);
                case "dessert":
                    return new Dessert(name, price);
                default:
                    throw new IllegalArgumentException("Unknown menu item type: " + type);
            }
        }
    }


  4. Use the Factory to Create Menu Items in Your POS System:

  Now, whenever you need to add a new menu item to an order, the factory creates the 
  appropriate type of menu item. This is useful when the cashier is adding different 
  types of food or drink to an order.

  For example, in a controller class in your JavaFX project:

    public class POSController {

      public void addMenuItemToOrder(String type, String name, double price) {
          // Create a menu item using the factory
          MenuItem newItem = MenuItemFactory.createMenuItem(type, name, price);
          
          // Add the item to the order (in this example, we'll just print it)
          System.out.println("Added " + newItem.getName() + " to the order. Price: " + newItem.getPrice());
  
          // In your actual JavaFX app, this would update the UI (e.g., adding to a list view or order table)
        }
    }

## Example Usage:

    public class Main {
      public static void main(String[] args) {
          POSController controller = new POSController();
  
          // Adding different types of menu items dynamically
          controller.addMenuItemToOrder("Beverage", "Coffee", 2.50);
          controller.addMenuItemToOrder("MainCourse", "Chicken Tinola", 5.00);
          controller.addMenuItemToOrder("Dessert", "Halo-Halo", 3.75);
        }
    }


## How It Works:

- The Factory (MenuItemFactory) is responsible for creating different types of MenuItem objects based on the type provided (Beverage, MainCourse, Dessert).
- The POS Controller interacts with the factory to create the menu items without worrying about the specific class.
- This makes your code flexible and maintainable. If you ever need to add a new type of menu item (e.g., Appetizer), you simply add a new class and update the factory.

## Benefits of Using the Factory Pattern in Your JavaFX POS Project:

- Centralized Object Creation: All menu item creation is handled in one place (the factory), making it easier to modify or extend.
- Loose Coupling: The controller doesn’t need to know the specifics of how to create each menu item; it just asks the factory to create it.
- Scalability: If you add more menu item types in the future, the factory can easily handle the changes without altering other parts of your code.

This approach can help streamline adding items to the order in your POS system, ensuring that the UI is flexible and easy to maintain as the system grows.
