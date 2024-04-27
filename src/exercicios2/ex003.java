package exercicios2;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = A % B;
        D = B % A;

        if (C == 0 || D == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Não sao Multiplos");
        }
        sc.close();
    }
}
