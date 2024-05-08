package exerciciosvect.ex007.application;

import exerciciosvect.ex007.entities.Num;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        Num[] vect = new Num[n];

        int num = 0;
        for (int i=0; i< vect.length; i++){
            System.out.print("Digite um numero: ");
            num = sc.nextInt();

            vect[i] = new Num(num);
        }

        double soma = 0;
        int npar = 0;
        for (int i=0; i< vect.length; i++){
            if (vect[i].getNum() % 2 == 0){
                soma += vect[i].getNum();
                npar++;
            }
        }

         double mediap = soma / npar;

        if (mediap > 0){
            System.out.print("MEDIA DOS PARES = " + mediap);
        } else {
            System.out.print("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
