package org.virusoft;

public class Beverage implements MenuItem {
    private final String name;
    private final double price;

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
