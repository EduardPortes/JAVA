package exerciciosvect.ex008.application;

import exerciciosvect.ex008.entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] vect = new Person[n];

        for (int i=0; i< vect.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            vect[i] = new Person(name, idade);
        }

        int maiorIdade = 0;
        int endeMaior = 0 ;
        for (int i=0; i< vect.length; i++){
            if (vect[i].getIdade() > maiorIdade){
                maiorIdade = vect[i].getIdade();
                endeMaior = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + vect[endeMaior].getName());

        sc.close();
    }
}
