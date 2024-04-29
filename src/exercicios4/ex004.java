package exercicios4;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            double divi = 0;

            if (b != 0){
                divi = (double) a / b;
                System.out.printf("%.1f%n", divi);
            } else {
                System.out.println("divisão impossivel");
            }
        }

        sc.close();
    }
}
