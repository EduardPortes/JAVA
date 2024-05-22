package progstudo.employeeEx.application;

import progstudo.employeeEx.entities.Employee;
import progstudo.employeeEx.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> emply = new ArrayList<>();


        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.printf("Employee #%d data: %n", i);
            System.out.print("Outsourced (y/n)? ");
            char tof = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (tof == 'y'){
                System.out.print("Additional charge: ");
                Double additional = sc.nextDouble();

                Employee empl = new OutsourcedEmployee(name, hours, valuePerHour, additional);
                emply.add(empl);

            } else{
                Employee empl = new Employee(name, hours, valuePerHour);
                emply.add(empl);
            }

        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee empl : emply){
            System.out.println(empl);
        }


        sc.close();
    }
}
