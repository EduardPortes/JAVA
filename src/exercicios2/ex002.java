package exercicios2;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        //Resto da divisão de a por 2
        int b = a % 2;

        if (b == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
