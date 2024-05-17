package progstudo.composition01.application;

import progstudo.composition01.entities.Department;
import progstudo.composition01.entities.HourContract;
import progstudo.composition01.entities.Worker;
import progstudo.composition01.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        System.out.println("Enter worker data");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base Salary: ");
        double bSala = sc.nextDouble();
        System.out.println();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), bSala, new Department(department));

        System.out.print("How many contract's to this worker? ");
        int n = sc.nextInt();


        for (int i=0; i<n; i++){
            System.out.println("Enter contract #" + (i+1) + " data");

            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            double vHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(date, vHour, hours);
            worker.addContract(contract);
            System.out.println();
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println();

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        sc.close();
    }
}
