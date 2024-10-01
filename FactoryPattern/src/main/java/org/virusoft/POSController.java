package org.virusoft;

public class POSController {

    public void addMenuItemToOrder(String type, String name, double price) {
        // Create a menu item using the factory
        MenuItem newItem = MenuItemFactory.createMenuItem(type, name, price);

        // Add the item to the order (in this example, we'll just print it)
        System.out.println("Added " + newItem.getName() + " to the order. Price: " + newItem.getPrice());

        // In your actual JavaFX app, this would update the UI (e.g., adding to a list view or order table)
    }
}

