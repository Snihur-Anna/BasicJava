package edu.ntudp.sau.snihur.lab4.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.ntudp.sau.snihur.lab4.model.University;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Клас для перетворення об'єкта University у формат JSON
 * та зворотного відновлення, а також для роботи з файлом.
 */
public class JsonManager {

    // Один екземпляр Gson, який форматовано виводить JSON
    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    /**
     * Серіалізація університету у JSON-рядок.
     */
    public static String toJson(University university) {
        return GSON.toJson(university);
    }

    /**
     * Десеріалізація університету з JSON-рядка.
     */
    public static University fromJson(String json) {
        return GSON.fromJson(json, University.class);
    }

    /**
     * Запис університету у файл у форматі JSON.
     */
    public static void writeToFile(University university, Path path) throws IOException {
        String json = toJson(university);
        Files.writeString(path, json);
    }

    /**
     * Зчитування університету з JSON-файлу.
     */
    public static University readFromFile(Path path) throws IOException {
        String json = Files.readString(path);
        return fromJson(json);
    }
}
