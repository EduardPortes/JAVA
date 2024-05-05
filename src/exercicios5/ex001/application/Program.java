package exercicios5.ex001.application;

import exercicios5.ex001.entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle width: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Enter rectangle height: ");
        rectangle.height = sc.nextDouble();

        System.out.print(rectangle);



        sc.close();
    }
}
