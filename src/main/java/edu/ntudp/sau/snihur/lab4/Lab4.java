package edu.ntudp.sau.snihur.lab4;

import edu.ntudp.sau.snihur.lab4.controller.UniversityCreator;
import edu.ntudp.sau.snihur.lab4.json.JsonManager;
import edu.ntudp.sau.snihur.lab4.model.University;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Демонстрація ЛР4:
 * створити університет -> записати в JSON файл -> прочитати назад -> порівняти.
 */
public class Lab4 {

    public static void main(String[] args) throws IOException {
        // 1. Створюємо типовий університет (oldUniversity)
        UniversityCreator creator = new UniversityCreator();
        University oldUniversity = creator.createTypicalUniversity();

        // 2. Записуємо у файл у форматі JSON
        Path path = Path.of("university_lab4.json");
        JsonManager.writeToFile(oldUniversity, path);
        System.out.println("Університет записано у файл: " + path.toAbsolutePath());

        // 3. Зчитуємо з файлу та відновлюємо (newUniversity)
        University newUniversity = JsonManager.readFromFile(path);
        System.out.println("Відновлений університет:");
        System.out.println(newUniversity);

        // 4. Перевіряємо, що університети еквівалентні
        System.out.println("oldUniversity.equals(newUniversity) = "
                + oldUniversity.equals(newUniversity));
    }
}
