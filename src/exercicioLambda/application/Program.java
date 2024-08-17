package exercicioLambda.application;

import exercicioLambda.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path of file: ");
        String path = sc.nextLine();

        List<Product> list = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){

            String line = bf.readLine();

            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bf.readLine();

            }

            double avg = list.stream()
                            .map(p -> p.getPrice())
                                    .reduce(0.0, (x,y) -> x + y) / list.size();

            System.out.println("Average Price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = (List<String>) list.stream()
                            .filter(p -> p.getPrice() < avg)
                            .map(p -> p.getName())
                            .sorted(comp.reversed())
                            .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
