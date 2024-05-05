package progstudo.products.application;


import progstudo.products.util.Product;

import java.util.Scanner;

public  class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product prod = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + prod);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        prod.addProducts(sc.nextInt());


        System.out.println();
        System.out.print("Update data: " + prod);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        prod.removeProducts(sc.nextInt());

        System.out.println();
        System.out.print("Update data: " + prod);


        sc.close();
    }
}