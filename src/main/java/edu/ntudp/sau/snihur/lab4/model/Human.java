package edu.ntudp.sau.snihur.lab4.model;

import java.util.Objects;

public class Human {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Sex sex;

    public Human(String lastName, String firstName, String patronymic, Sex sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + patronymic + " (" + sex + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(lastName, human.lastName)
                && Objects.equals(firstName, human.firstName)
                && Objects.equals(patronymic, human.patronymic)
                && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, patronymic, sex);
    }
}
