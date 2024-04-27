package exercicios2;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
        sc.close();
    }
}
