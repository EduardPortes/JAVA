package exercicios3;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int code = sc.nextInt();

        while (code != 4){
            if (code == 1){
                alcool += 1;
            } else if (code == 2){
                gasolina += 1;
            } else if (code == 3) {
                diesel += 1;
            }
            code = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
