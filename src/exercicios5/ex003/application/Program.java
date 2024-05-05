package exercicios5.ex003.application;

import exercicios5.ex003.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st = new Student();

        st.name = sc.nextLine();
        st.nota1 = sc.nextDouble();
        st.nota2 = sc.nextDouble();
        st.nota3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + st.finalGrade());
        if (st.finalGrade() >= 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", st.missingPoints());
        }



        sc.close();
    }
}
