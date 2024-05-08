package progstudo.ztestes.entities;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
