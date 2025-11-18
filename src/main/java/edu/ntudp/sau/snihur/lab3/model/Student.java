package edu.ntudp.sau.snihur.lab3.model;

import java.util.Objects;

public class Student extends Human implements UniversityUnit {

    private String name;
    private Human head;

    public Student(String name,
                   Human head,
                   String lastName,
                   String firstName,
                   String patronymic,
                   Sex sex) {
        super(lastName, firstName, patronymic, sex);
        this.name = name;
        this.head = head;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", person=" + super.toString() +
                ", head=" + head +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name)
                && Objects.equals(head, student.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, head);
    }
}
