package edu.ntudp.sau.snihur.lab3.model;

import java.util.ArrayList;
import java.util.List;

public class Group extends AbstractUnit {

    private final List<Student> students = new ArrayList<>();

    public Group(String name, Human head) {
        super(name, head);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Group: " + super.toString() + "\n");
        for (Student s : students) {
            sb.append("    ").append(s).append("\n");
        }
        return sb.toString();
    }
}
