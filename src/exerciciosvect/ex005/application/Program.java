package exerciciosvect.ex005.application;

import exerciciosvect.ex005.entities.Num;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        Num[] a = new Num[n];
        Num[] b = new Num[n];
        Num[] c = new Num[n];


        System.out.println("Digite os valores do vetor A:");
        int numA = 0;
        for (int i=0; i<a.length; i++){
            numA = sc.nextInt();
            a[i] = new Num(numA);
        }

        System.out.println("Digite os valores do vetor B:");
        int numB = 0;
        for (int i=0; i<b.length; i++){
            numB = sc.nextInt();
            b[i] = new Num(numB);
        }

        int numC = 0;
        for (int i=0; i<c.length; i++){
            numC = a[i].getNum() + b[i].getNum();
            c[i] = new Num(numC);
        }

        System.out.println("VETOR RESULTANTE");

        for (int i=0; i<c.length; i++){
            System.out.println(c[i].getNum());
        }

        sc.close();
    }
}
