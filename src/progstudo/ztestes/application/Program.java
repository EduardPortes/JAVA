package progstudo.ztestes.application;

import progstudo.ztestes.entities.Product;
import progstudo.ztestes.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "D:\\Downloads\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] pd = line.split(",");
                String name = pd[0];
                Double price = Double.parseDouble(pd[1]);

                Product p = new Product(name, price);
                list.add(p);
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }









    }

}
