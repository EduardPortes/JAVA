package exerciciosAbs.application;

import exerciciosAbs.entities.Company;
import exerciciosAbs.entities.Individual;
import exerciciosAbs.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=n; i++){
            System.out.printf("Tax payer #%d data %n", i);
            System.out.print("Individual or company (i/c)? ");
            char tof = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            switch (tof){
                case 'i':
                    System.out.print("Health expenditures: ");
                    Double health = sc.nextDouble();

                    Person pI = new Individual(name, anualIncome, health);
                    list.add(pI);
                    break;
                case 'c':
                    System.out.print("Health expenditures: ");
                    Integer emp = sc.nextInt();

                    Person pC = new Company(name, anualIncome, emp);
                    list.add(pC);
                    break;
            }
        }

        System.out.println();
        System.out.println("TAXEX PAID");

        double sum = 0.0;

        for (Person p : list){
            System.out.println(p.toString());
            sum += p.imposto();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", sum);


        sc.close();
    }
}
