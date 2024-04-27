package exercicios1;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peca1, num1, peca2, num2;
        double val1, val2, valpagar;

        peca1 = sc.nextInt();
        num1 = sc.nextInt();
        val1 = sc.nextDouble();
        peca2 = sc.nextInt();
        num2 = sc.nextInt();
        val2 = sc.nextDouble();

        valpagar = ((num1 * val1) + (num2 * val2));
        System.out.printf("VALOR A PAGAR = R$%.2f", valpagar);

        sc.close();
    }
}
