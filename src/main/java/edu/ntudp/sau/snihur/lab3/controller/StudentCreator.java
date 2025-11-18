package edu.ntudp.sau.snihur.lab3.controller;

import edu.ntudp.sau.snihur.lab3.model.Human;
import edu.ntudp.sau.snihur.lab3.model.Sex;
import edu.ntudp.sau.snihur.lab3.model.Student;

public class StudentCreator {

    public Student createStudent(String id,
                                 Human curator,
                                 String lastName,
                                 String firstName,
                                 String patronymic,
                                 Sex sex) {
        return new Student(id, curator, lastName, firstName, patronymic, sex);
    }
}
