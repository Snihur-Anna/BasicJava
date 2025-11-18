package edu.ntudp.sau.snihur.lab3.controller;

import edu.ntudp.sau.snihur.lab3.model.*;

public class UniversityCreator {

    public University createTypicalUniversity() {
        // Ректор
        Human rector = new Human(
                "Сидоренко",
                "Олександр",
                "Петрович",
                Sex.MALE
        );

        University university = new University("Національний університет прикладу", rector);

        StudentCreator studentCreator = new StudentCreator();
        GroupCreator groupCreator = new GroupCreator(studentCreator);
        DepartmentCreator departmentCreator = new DepartmentCreator(groupCreator);
        FacultyCreator facultyCreator = new FacultyCreator(departmentCreator);

        Human dean1 = new Human("Коваленко", "Ірина", "Миколаївна", Sex.FEMALE);
        Human dean2 = new Human("Гончар", "Олег", "Ігорович", Sex.MALE);

        Faculty faculty1 = facultyCreator.createTypicalFaculty("Факультет комп'ютерних наук", dean1);
        Faculty faculty2 = facultyCreator.createTypicalFaculty("Факультет економіки", dean2);

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        return university;
    }
}
