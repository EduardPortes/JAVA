package exercicios4;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++){

            int qua = (int) Math.pow(i,2);
            int cubo = (int) Math.pow(i, 3);

            System.out.print(i + " ");
            System.out.print(qua + " ");
            System.out.println(cubo);

        }


        sc.close();
    }
}
