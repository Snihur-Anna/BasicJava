package edu.ntudp.sau.snihur.lab3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University extends AbstractUnit {

    private final List<Faculty> faculties = new ArrayList<>();

    public University(String name, Human head) {
        super(name, head);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("University: " + super.toString() + "\n");
        for (Faculty f : faculties) {
            sb.append(f);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        if (!super.equals(o)) return false;
        University that = (University) o;
        return Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), faculties);
    }
}

