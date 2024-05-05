package progstudo.products.util;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int p){
        quantity += p;
    }

    public void removeProducts(int p){
        quantity -= p;;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f",price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
