package exercicios4;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x >= 1 && x <= 1000){
            for (int i=1; i<=x; i++){
                int y = i%2;
                if (y == 1){
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Insira um numero de 1 a 1000");
        }




        sc.close();
    }
}
