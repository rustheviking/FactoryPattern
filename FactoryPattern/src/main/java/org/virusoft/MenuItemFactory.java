package org.virusoft;

public class MenuItemFactory {
    // Factory method to create menu items
    public static MenuItem createMenuItem(String type, String name, double price) {
        return switch (type.toLowerCase()) {
            case "beverage" -> new Beverage(name, price);
            case "maincourse" -> new MainCourse(name, price);
            case "dessert" -> new Dessert(name, price);
            default -> throw new IllegalArgumentException("Unknown menu item type: " + type);
        };
    }
}

