package exerciciosvect.ex003.application;

import exerciciosvect.ex003.entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int yOld = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();
            System.out.println();

            vect[i] = new Person(name, yOld, height);
        }
        double soma = 0;
        for (int i=0; i<vect.length; i++){
            soma += vect[i].getHeight();
        }

        int nmenores = 0;
        double alturatotal = 0;
        for (int i=0; i<vect.length; i++){
            if (vect[i].getyOld() < 16){
                nmenores++;
            }
            alturatotal = alturatotal + vect[i].getHeight();
        }

        double alturamedia = alturatotal / n;

        double percentualMenores = ((double)nmenores / n) * 100;

        System.out.printf("Altura media: %.2f%n", alturamedia);
        System.out.println("Pessoas com menos de 16 anos: " + percentualMenores +"%");

        String name;
        for (int i=0; i<vect.length; i++){
            if (vect[i].getyOld() < 16){
                name = vect[i].getName();
                System.out.println(name);
            }
        }

        sc.close();
    }
}
