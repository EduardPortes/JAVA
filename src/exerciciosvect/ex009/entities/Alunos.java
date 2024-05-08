package exerciciosvect.ex009.entities;

import java.security.PublicKey;

public class Alunos {
    private String name;
    private double n1;
    private double n2;
    private double media;

    public Alunos(String name, double n1, double n2, double media){
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getMedia() {
        return media;
    }
}
