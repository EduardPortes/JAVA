package exerciciosvect.ex010.entities;

public class Person {
    private double height;
    private char gender;

    public Person(double height, char gender) {
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }
}
