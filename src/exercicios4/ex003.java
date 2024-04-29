package exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double m1 = (n1 * 2 + n2 * 3 + n3 * 5)/10;

            System.out.printf("%.1f", m1);
        }

        sc.close();
    }
}
