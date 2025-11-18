package edu.ntudp.sau.snihur.lab3;

import edu.ntudp.sau.snihur.lab3.controller.UniversityCreator;
import edu.ntudp.sau.snihur.lab3.model.University;

public class Lab3 {

    public static void main(String[] args) {
        UniversityCreator creator = new UniversityCreator();
        University university = creator.createTypicalUniversity();

        System.out.println("=== Typical University Structure ===");
        System.out.println(university);
    }
}