package org.virusoft;

public class MainCourse implements MenuItem {
    private final String name;
    private final double price;

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
