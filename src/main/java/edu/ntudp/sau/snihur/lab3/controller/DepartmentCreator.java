package edu.ntudp.sau.snihur.lab3.controller;

import edu.ntudp.sau.snihur.lab3.model.Department;
import edu.ntudp.sau.snihur.lab3.model.Group;
import edu.ntudp.sau.snihur.lab3.model.Human;

public class DepartmentCreator {

    private final GroupCreator groupCreator;

    public DepartmentCreator(GroupCreator groupCreator) {
        this.groupCreator = groupCreator;
    }

    public Department createTypicalDepartment(String name, Human head) {
        Department department = new Department(name, head);

        Group group1 = groupCreator.createTypicalGroup(name + "-101", head);
        Group group2 = groupCreator.createTypicalGroup(name + "-102", head);

        department.addGroup(group1);
        department.addGroup(group2);

        return department;
    }
}
