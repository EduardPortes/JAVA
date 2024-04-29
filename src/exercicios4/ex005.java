package exercicios4;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fa = 1;
        for (int i=1; i<=n; i++){
            fa *= i;
        }

        System.out.println(fa);

        sc.close();
    }
}
