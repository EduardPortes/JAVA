package exerciciosSet.application;

import exerciciosSet.entities.Student;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Student> set = new HashSet<>();

        char course = 'A';
        int x = 1;
        while(x < 4){

            switch (x){
                case 1: course = 'A';
                        break;
                case 2: course = 'B';
                        break;
                case 3: course = 'C';
                        break;
            }

            System.out.print("How many students for course " + course +"?");
            int n = sc.nextInt();

            for (int i=0; i<n; i++){
                int code = sc.nextInt();


                set.add(new Student(code, course));
            }

            x++;
        }

        System.out.println("Total students: " + set.size());


    }

}
