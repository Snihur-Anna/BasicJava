package edu.ntudp.sau.snihur.lab3.controller;

import edu.ntudp.sau.snihur.lab3.model.Department;
import edu.ntudp.sau.snihur.lab3.model.Faculty;
import edu.ntudp.sau.snihur.lab3.model.Human;

public class FacultyCreator {

    private final DepartmentCreator departmentCreator;

    public FacultyCreator(DepartmentCreator departmentCreator) {
        this.departmentCreator = departmentCreator;
    }

    public Faculty createTypicalFaculty(String name, Human dean) {
        Faculty faculty = new Faculty(name, dean);

        Department dep1 = departmentCreator.createTypicalDepartment(
                name + " кафедра 1", dean);
        Department dep2 = departmentCreator.createTypicalDepartment(
                name + " кафедра 2", dean);

        faculty.addDepartment(dep1);
        faculty.addDepartment(dep2);

        return faculty;
    }
}
