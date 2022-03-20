package ru.javarush.drogunov.data;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static ru.javarush.drogunov.constant.Constants.TXT_FOLDER;

public class DataOutput {
    Path path;

    public DataOutput(String path) {
        this.path = Path.of(TXT_FOLDER + path);
    }

    public void write(StringBuilder outputText) {
    /*    try {
            Files.createFile(Path.of(path + ".txt"));
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (IOException j) {
            j.printStackTrace();
        }*/

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.wrap(outputText.toString().getBytes(StandardCharsets.UTF_8));
            fileChannel.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            //TODO Бросить исключение или создать новый файл, еще подумать о ситуации когда файл занят другим приложением
        }
    }


}
