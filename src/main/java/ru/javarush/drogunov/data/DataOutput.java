package ru.javarush.drogunov.data;

import ru.javarush.drogunov.exceptions.AppExceptions;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static ru.javarush.drogunov.constant.Constants.TXT_FOLDER;

public class DataOutput {


    public void write(StringBuilder outputText, Path path) {

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.wrap(outputText.toString().getBytes(StandardCharsets.UTF_8));
            fileChannel.write(buffer);
        } catch (IOException e) {
            throw new AppExceptions("Ошибка файла для записи", e);
        }
    }
}