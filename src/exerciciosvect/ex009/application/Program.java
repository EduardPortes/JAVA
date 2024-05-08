package exerciciosvect.ex009.application;

import exerciciosvect.ex009.entities.Alunos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        Alunos[] vect = new Alunos[n];

        double media = 0;
        for (int i=0; i<vect.length; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i+1);
            String name = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            media = (n1 + n2) / 2;

            vect[i] = new Alunos(name, n1, n2, media);
            sc.nextLine();
        }

        for (int i=0; i<vect.length; i++){
            if (vect[i].getMedia() >= 6){
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
