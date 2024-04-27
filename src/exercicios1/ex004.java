package exercicios1;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, b;
        double valHora, salary;

        num = sc.nextInt();
        b = sc.nextInt();
        valHora = sc.nextDouble();
        salary = b * valHora;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$%.2f", salary);
        sc.close();
    }
}
