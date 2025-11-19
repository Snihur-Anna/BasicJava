package edu.ntudp.sau.snihur.lab5;

import java.util.List;
import java.util.Scanner;

/**
 * Головний клас для запуску лабораторної роботи №5.
 */
public class Lab5 {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Лабораторна робота №5: робота з БД через JDBC ===");
        System.out.println("Програма виводить студентів, які народилися у вказаному місяці.");

        while (true) {
            System.out.print("\nВведіть номер місяця (1–12) або 0 для завершення: ");

            int month;
            try {
                month = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введіть, будь ласка, число від 0 до 12.");
                continue;
            }

            if (month == 0) {
                System.out.println("Роботу завершено.");
                break;
            }

            if (month < 1 || month > 12) {
                System.out.println("Номер місяця має бути в діапазоні 1–12.");
                continue;
            }

            List<Student> students = studentDao.findByBirthMonth(month);

            if (students.isEmpty()) {
                System.out.println("Студентів, які народилися в цьому місяці, немає.");
            } else {
                System.out.println("\nID  | ПІБ                               | Дата нар. | Залік");
                System.out.println("----+------------------------------------+-----------+------");
                for (Student student : students) {
                    System.out.println(student);
                }
            }
        }

        scanner.close();
    }
}
