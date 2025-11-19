import edu.ntudp.sau.snihur.lab4.controller.UniversityCreator;
import edu.ntudp.sau.snihur.lab4.json.JsonManager;
import edu.ntudp.sau.snihur.lab4.model.University;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Тест з методички:
 * oldUniversity -> JSON файл -> newUniversity -> порівняти equals.
 */
public class UniversityJsonTest {

    @Test
    void testJsonSerializationAndDeserialization() throws IOException {
        // 1. Створити oldUniversity (у кожному підрозділі по 2 підрозділи нижчого рівня)
        UniversityCreator creator = new UniversityCreator();
        University oldUniversity = creator.createTypicalUniversity();

        // 2. Записати в файл у форматі JSON
        Path path = Path.of("target", "test-output", "university.json");
        Files.createDirectories(path.getParent());
        JsonManager.writeToFile(oldUniversity, path);

        // 3. Зчитати з файлу і створити newUniversity
        University newUniversity = JsonManager.readFromFile(path);

        // 4. Порівняти університети
        Assertions.assertEquals(oldUniversity, newUniversity);
    }
}
