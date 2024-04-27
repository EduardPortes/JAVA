package exercicios1;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        double tri, cir, tra, qua, re;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        tri = (A*C) / 2;
        cir = 3.14159 * (Math.pow(C, 2));
        tra = (A+B) * C / 2;
        qua = Math.pow(B, 2);
        re = A * B;

        System.out.printf("TRIANGULO: %.3f%n", tri);
        System.out.printf("CIRCULO: %.3f%n", cir);
        System.out.printf("TRAPEZIO: %.3f%n", tra);
        System.out.printf("QUADRADO: %.3f%n", qua);
        System.out.printf("RETANGULO: %.3f%n", re);
    }
}
