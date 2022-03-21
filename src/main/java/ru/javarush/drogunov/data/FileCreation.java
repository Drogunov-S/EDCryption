package ru.javarush.drogunov.data;

import ru.javarush.drogunov.exceptions.AppExceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreation {

    public static Path creation(Path path) {
        int count = 1;
        while (Files.exists(path)) {
            path = Path.of(path.getParent() + File.separator + getNewFileName(path.getFileName().toString(), count));
            count++;
        }


        try {
            Files.createFile(path);
            return path;
        } catch (IOException e) {
            throw new AppExceptions("Ошибка создания файла", e);
        }
    }

    private static String getNewFileName(String oldFileName, int number) {
        int dotIndex = oldFileName.lastIndexOf(".");
        return oldFileName.substring(0, dotIndex) + "(" + number + ")" + oldFileName.substring(dotIndex);
    }

}
