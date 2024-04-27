package exercicios2;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hinicial, hfinal, duracao;

        hinicial = sc.nextInt();
        hfinal = sc.nextInt();

        if(hinicial < hfinal) {
            duracao = hfinal - hinicial;
        } else {
            duracao = 24 - hinicial + hfinal;
        }
        System.out.println("O JOGO DUROU " + duracao + "HORA(S)");

        sc.close();
    }
}
