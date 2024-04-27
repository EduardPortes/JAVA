package exercicios2;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        if (num > 25 && num <=50){
            System.out.println("Intervalo: (25,50)");
        } else if (num >= 0 && num <= 25){
            System.out.println("Intervalo: (0,25)");
        } else if (num >= 75 && num <= 100) {
            System.out.println("Intevalo: (75,100)");
        } else {
            System.out.println("Fora do intervalo");
        }


        sc.close();
    }

}
