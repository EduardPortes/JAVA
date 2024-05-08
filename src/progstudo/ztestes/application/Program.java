package progstudo.ztestes.application;

import progstudo.ztestes.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount of Products: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            System.out.println();
        }

        double sum = 0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.printf("Average price = %.2f%n", avg);

        sc.close();
    }
}
