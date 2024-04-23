package org.example;

public class Product {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    private double cost;
    public Product(
            int id, String name, double cost) {
        this.id=id;
        this.name=name;
        this.cost=cost;
    }
    public String

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
