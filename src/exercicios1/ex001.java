package exercicios1;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = (a + b);
        System.out.printf("SOMA = %d", c);
        sc.close();
    }
}


// %f ponto flutuante
// %d inteiro
// %s string
// %n quebra de linha