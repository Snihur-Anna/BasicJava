package edu.ntudp.sau.snihur.lab3.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends AbstractUnit {

    private final List<Department> departments = new ArrayList<>();

    public Faculty(String name, Human head) {
        super(name, head);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Faculty: " + super.toString() + "\n");
        for (Department d : departments) {
            sb.append(d);
        }
        return sb.toString();
    }
}
