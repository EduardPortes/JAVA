package exerciciosvect.ex010.application;

import exerciciosvect.ex010.entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i=0; i < vect.length; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            double h = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Genero da %da pessoa: ", i+1);
            char g = sc.nextLine().charAt(0);

            vect[i] = new Person(h, g);
        }



        double maior = 0;
        double menor = 10;
        for (int i=0; i < vect.length; i++){
            //verifica qual é a maior altura
            if (vect[i].getHeight() > maior){
                maior = vect[i].getHeight();
            }
            //verifica qual é a menor altura
            if (vect[i].getHeight() < menor){
                menor = vect[i].getHeight();
            }
        }
        // faz a soma das alturas de todas as mulheres e quantas são
        double soma = 0;
        int numFem = 0;
        for (int i=0; i < vect.length; i++){
            if (vect[i].getGender() == 'F'){
                soma += vect[i].getHeight() ;
                numFem++;
            }
        }

        double media = soma / numFem;

        int numMas = vect.length - numFem;

        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", media);
        System.out.println("Numero de homens = " + numMas);


        sc.close();
    }
}
