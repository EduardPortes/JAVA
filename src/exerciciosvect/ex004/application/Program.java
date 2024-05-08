package exerciciosvect.ex004.application;

import exerciciosvect.ex004.entities.Authenticator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        // cria um array com "n" elementos
        Authenticator[] vect = new Authenticator[n];

        // pega os num e coloca em cada um dos elementos do array
        for (int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            vect[i] = new Authenticator(num);
        }

        System.out.println();

        int quantpar = 0;

        for (int i=0; i<vect.length; i++){
            if (vect[i].getNum() % 2 == 0){
                System.out.print(vect[i].getNum() + " ");
                quantpar++;
            }
        }
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + quantpar);


        sc.close();
    }
}
