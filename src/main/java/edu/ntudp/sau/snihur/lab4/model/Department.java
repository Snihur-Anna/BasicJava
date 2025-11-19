package edu.ntudp.sau.snihur.lab4.model;

import java.util.ArrayList;
import java.util.List;

public class Department extends AbstractUnit {

    private final List<Group> groups = new ArrayList<>();

    public Department(String name, Human head) {
        super(name, head);
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Department: " + super.toString() + "\n");
        for (Group g : groups) {
            sb.append("  ").append(g);
        }
        return sb.toString();
    }
}
