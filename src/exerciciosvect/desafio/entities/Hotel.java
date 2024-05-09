package exerciciosvect.desafio.entities;

public class Hotel {
    private String name;
    private String mail;
    private int room;

    public Hotel(String name, String mail, int room) {
        this.name = name;
        this.mail = mail;
        this.room = room;
    }
    public Hotel() {

    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public int getRoom() {
        return room;
    }

    public String toString() {
        return room + ": " + name + ", " + mail;
    }
}
