package exerciciosvect.ex008.entities;

public class Person {
    private String name;
    private int idade;

    public Person(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }
}
