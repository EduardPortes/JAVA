package exerciciosSet.entities;

import java.util.Objects;

public class Student {

    private int code;
    private char course;

    public Student(int code, char course) {
        this.code = code;
        this.course = course;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public char getCourse() {
        return course;
    }

    public void setCourse(char course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return code == student.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
