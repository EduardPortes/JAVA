package exercicios4;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++){

            int x = n % i;
            if(x == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
