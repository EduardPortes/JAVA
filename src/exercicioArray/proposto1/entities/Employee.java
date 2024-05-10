package exercicioArray.proposto1.entities;


import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salario) {
        this.id = id;
        this.name = name;
        this.salary = salario;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        salary += salary * percentage / 100;
    }

    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        return emp != null;
    }






    public String toString() {
        return id
                + ", "
                + name
                + ", "
                + String.format("%.2f", salary);
    }
}
