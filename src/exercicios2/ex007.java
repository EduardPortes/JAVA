package exercicios2;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B;
        A = sc.nextDouble();
        B = sc.nextDouble();

        if (A > 0 && B > 0) {
            System.out.println("Q1");
        } else if (A < 0 && B > 0) {
            System.out.println("Q2");
        } else if (A < 0 && B < 0) {
            System.out.println("Q3");
        } else if (A > 0 && B < 0) {
            System.out.println("Q4");
        } else if (A == 0 && B == 0){
            System.out.println("Origem");
        }


        sc.close();
    }
}
