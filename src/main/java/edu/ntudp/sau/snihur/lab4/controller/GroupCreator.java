package edu.ntudp.sau.snihur.lab4.controller;

import edu.ntudp.sau.snihur.lab4.model.Group;
import edu.ntudp.sau.snihur.lab4.model.Human;
import edu.ntudp.sau.snihur.lab4.model.Sex;
import edu.ntudp.sau.snihur.lab4.model.Student;

public class GroupCreator {

    private final StudentCreator studentCreator;

    public GroupCreator(StudentCreator studentCreator) {
        this.studentCreator = studentCreator;
    }

    public Group createTypicalGroup(String groupName, Human head) {
        Group group = new Group(groupName, head);

        Student s1 = studentCreator.createStudent(
                groupName + "-S1",
                head,
                "Іваненко",
                "Іван",
                "Іванович",
                Sex.MALE
        );

        Student s2 = studentCreator.createStudent(
                groupName + "-S2",
                head,
                "Петренко",
                "Марія",
                "Петрівна",
                Sex.FEMALE
        );

        group.addStudent(s1);
        group.addStudent(s2);

        return group;
    }
}
