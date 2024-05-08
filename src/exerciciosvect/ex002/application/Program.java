package exerciciosvect.ex002.application;

import exerciciosvect.ex002.entities.Unit;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        Unit[] vector = new Unit[n];


        for (int i=0; i<vector.length; i++){
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            vector[i] = new Unit(num);
        }

        double soma = 0;
        for (int i=0; i<vector.length; i++){
            soma += vector[i].getUnit();
        }

        double media = soma / n;


        System.out.print("Valores = ");

        for (int i=0; i< vector.length; i++){
            System.out.printf("%.1f ", vector[i].getUnit());
        }

        System.out.println();
        System.out.printf("SOMA = %.2f", soma);

        System.out.println();
        System.out.printf("MEDIA = %.2f", media);



        sc.close();
    }
}
