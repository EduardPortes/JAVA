package exerciciosvect.desafio.application;

import exerciciosvect.desafio.entities.Hotel;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms wil be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        Hotel[] ho = new Hotel[9];

        String name = "VAZIO";
        String mail;
        int room = 0;

        for (int i=0; i<n; i++){
            System.out.printf("Rent #%d%n", i+1);
            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Email: ");
            mail = sc.nextLine();

            System.out.print("Room: ");
            room = sc.nextInt();
            sc.nextLine();
            System.out.println();


            ho[room] = new Hotel(name, mail, room);
        }

        System.out.println("Busy rooms:");

        for (int i=0; i < ho.length; i++){
          if (ho[i] != null){
              System.out.println(ho[i]);
          }
        }












        sc.close();
    }
}
