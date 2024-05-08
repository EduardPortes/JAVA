package exerciciosvect.ex003.entities;

public class Person {
    private String name;
    private int yOld;
    private double height;

    public Person(String name, int yOld, double height) {
        this.name = name;
        this.yOld = yOld;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getyOld() {
        return yOld;
    }

    public double getHeight() {
        return height;
    }


    public String toString() {
        return name;
    }
}
