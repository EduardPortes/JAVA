package progstudo.ztestes.application;

import progstudo.ztestes.entities.ImportedProducts;
import progstudo.ztestes.entities.Product;
import progstudo.ztestes.entities.UsedProduts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> prod = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.printf("Product #%d data: %n", i);

            System.out.print("Common, used or imported? (c/u/i): ");
            char tof = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            switch (tof){

                case 'c':
                    Product commum = new Product(name, price);
                    prod.add(commum);
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String manufactureDate = sc.nextLine();

                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    Product used = new UsedProduts(name, price, date);
                    prod.add(used);
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    Double customsFee = sc.nextDouble();

                    Product imp = new ImportedProducts(name, price, customsFee);
                    prod.add(imp);
                    break;

            }
        }

        System.out.println();
        System.out.println("PRICE TAGS");

        for (Product p : prod){
            System.out.println(p.priceTag());
        }



        sc.close();
    }
}
