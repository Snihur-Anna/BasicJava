package edu.ntudp.sau.snihur.lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Утилітний клас для створення підключень до бази даних.
 */
public class DbUtil {

    // Налаштуй параметри під свій MySQL
    private static final String URL =
            "jdbc:mysql://localhost:3306/university?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";      // логін з MySQL Workbench
    private static final String PASSWORD = "dndj7b01";  // пароль з MySQL Workbench

    private DbUtil() {
        // забороняємо створення об'єктів
    }

    public static Connection getConnection() throws SQLException {
        // Якщо драйвер є в pom.xml, цього достатньо
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
