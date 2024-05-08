package exerciciosvect.ex001.application;

import exerciciosvect.ex001.entities.Num;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        Num[] vector = new Num[n];


        for (int i=0; i<vector.length; i++){
            System.out.print("Digite um numero: ");
            int unit = sc.nextInt();
            vector[i] = new Num(unit);
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i=0; i< vector.length; i++){
            if (vector[i].getNum() < 0){
                System.out.printf("%d%n", vector[i].getNum());
            }
        }


        sc.close();
    }
}
