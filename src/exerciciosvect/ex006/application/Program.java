package exerciciosvect.ex006.application;

import exerciciosvect.ex006.entities.Num;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qauntos elementos vai ter o vetor? ");

        int n = sc.nextInt();

        Num[] vect = new Num[n];

        double num = 0;
        double soma = 0;
        for(int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
             num = sc.nextDouble();

            vect[i] = new Num(num);

            soma += num;
        }

        double media = soma / n;

        System.out.println("MEDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for(int i=0; i<vect.length; i++){
            if (vect[i].getNum() < media){
                System.out.println(vect[i].getNum());
            }
        }





        sc.close();
    }
}
