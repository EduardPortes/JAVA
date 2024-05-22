package progstudo.employeeEx.entities;

public class OutsourcedEmployee extends Employee {

    private Double additional;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additional) {
        super(name, hours, valuePerHour);
        this.additional = additional;
    }

    public Double additionalCharge(){
       return additional *= 1.1;
    }

    @Override
    public Double payment(){
        return valuePerHour * hours + additionalCharge();
    }




}
