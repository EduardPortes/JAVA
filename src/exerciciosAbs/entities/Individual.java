package exerciciosAbs.entities;

public class Individual extends Person{

    private Double health;

    public Individual(String name, Double anualIncome, Double health) {
        super(name, anualIncome);
        this.health = health;
    }

    @Override
    public double imposto() {
        if(anualIncome < 20000){
            return (anualIncome * 0.15) - (health * 0.5);
        } else {
            return (anualIncome * 0.25) - (health * 0.5);
        }
    }

    @Override
    public String toString() {
        return name
                + ": $ "
                + String.format("%.2f", imposto());
    }
}
