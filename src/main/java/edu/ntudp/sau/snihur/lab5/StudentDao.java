package edu.ntudp.sau.snihur.lab5;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас доступу до даних (DAO) для таблиці students.
 */
public class StudentDao {

    /**
     * Повертає список студентів, які народилися у вказаному місяці.
     *
     * @param month номер місяця (1–12)
     */
    public List<Student> findByBirthMonth(int month) {
        List<Student> result = new ArrayList<>();

        String sql = "SELECT id, last_name, first_name, middle_name, birth_date, record_book " +
                "FROM students " +
                "WHERE MONTH(birth_date) = ? " +
                "ORDER BY birth_date, last_name, first_name";

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, month);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String lastName = rs.getString("last_name");
                    String firstName = rs.getString("first_name");
                    String middleName = rs.getString("middle_name");
                    Date date = rs.getDate("birth_date");
                    LocalDate birthDate = date.toLocalDate();
                    String recordBook = rs.getString("record_book");

                    Student student = new Student(
                            id,
                            lastName,
                            firstName,
                            middleName,
                            birthDate,
                            recordBook
                    );
                    result.add(student);
                }
            }

        } catch (SQLException e) {
            System.err.println("Помилка при читанні студентів з БД: " + e.getMessage());
        }

        return result;
    }
}
