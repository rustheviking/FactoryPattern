package org.virusoft;

public class Main {
    public static void main(String[] args) {
        POSController controller = new POSController();

        // Adding different types of menu items dynamically
        controller.addMenuItemToOrder("Beverage", "Coffee", 2.50);
        controller.addMenuItemToOrder("MainCourse", "Chicken Tinola", 5.00);
        controller.addMenuItemToOrder("Dessert", "Halo-Halo", 3.75);
    }
}
