package edu.ntudp.sau.snihur.lab5;

import java.time.LocalDate;

/**
 * Модель студента з таблиці students.
 * Реалізована як record (Java 17).
 */
public record Student(
        int id,
        String lastName,
        String firstName,
        String middleName,
        LocalDate birthDate,
        String recordBook
) {

    @Override
    public String toString() {
        return String.format(
                "%3d | %-12s %-10s %-12s | %s | %-6s",
                id(),
                lastName(),
                firstName(),
                middleName(),
                birthDate(),
                recordBook()
        );
    }
}
