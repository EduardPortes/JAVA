package progstudo.ordertest.application;

import progstudo.ordertest.entities.Client;
import progstudo.ordertest.entities.Order;
import progstudo.ordertest.entities.OrderItem;
import progstudo.ordertest.entities.Product;
import progstudo.ordertest.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthdate = sc.next();
        System.out.println();

        Client client = new Client(name, email, sdf.parse(birthdate));

        System.out.println("Enter order data");
        System.out.print("Status: ");
        String status = sc.next();
        System.out.println();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int itens = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i=1; i<=itens; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String pName = sc.nextLine();

            System.out.print("Product price: ");
            double pPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            System.out.println();

            Product prod = new Product(pName, pPrice);
            OrderItem it = new OrderItem(quantity,pPrice, prod);
            order.addItem(it);
        }

        System.out.println(order);

        sc.close();
    }
}
