package exercicioArray.proposto1.application;

import exercicioArray.proposto1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static exercicioArray.proposto1.entities.Employee.hasId;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How may employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i=0; i<n; i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();

            while(hasId(list, id)){
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();

        Employee emp = list.stream().filter( x -> x.getId() == idsalary).findFirst().orElse(null);

        Integer pos = position(list, idsalary);

        if (pos == null){
            System.out.println("This id doesn't exist!");
            System.out.println();
        } else {
            System.out.print("Enter the percentage: ");
            double increase = sc.nextDouble();
            System.out.println();

            list.get(pos).increaseSalary(increase);
        }

        System.out.println("List of Employees:");

        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for (int i=0; i< list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}
