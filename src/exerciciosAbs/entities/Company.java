package exerciciosAbs.entities;

public class Company extends Person{

    private Integer employee;

    public Company(String name, Double anualIncome, Integer employee) {
        super(name, anualIncome);
        this.employee = employee;
    }

    @Override
    public double imposto() {
        if(employee < 10){
            return anualIncome * 0.16;
        } else {
            return anualIncome * 0.14;
        }
    }

    @Override
    public String toString() {
        return name
                + ": $ "
                + String.format("%.2f", imposto());
    }

}
