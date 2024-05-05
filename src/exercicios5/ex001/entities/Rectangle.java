package exercicios5.ex001.entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (width * 2) + (height * 2);
    }

    public double diagonal(){
        return Math.sqrt((Math.pow(height, 2)) + (Math.pow(width, 2)));
    }

    public String toString(){
        String newline = System.lineSeparator();
        return "AREA = " + String.format("%.2f", area())
                + newline
                + "PERIMETER = " + String.format("%.2f", perimeter())
                + newline
                + "DIAGONAL = " + String.format("%.2f", diagonal());
    }
}
