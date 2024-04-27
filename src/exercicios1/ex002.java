package exercicios1;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi, raio, area;

        pi = 3.14159;
        raio = sc.nextDouble();
        area =  pi * (Math.pow(raio, 2));
        System.out.printf("ÁREA = %.4f", area);
        sc.close();
    }
}
