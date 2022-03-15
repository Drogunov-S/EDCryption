package ru.javarush.drogunov.enity;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class DataOutput {
    Path path;

    public DataOutput(String path) {
        this.path = Path.of(path);
    }

    public void write(StringBuilder outputText) {


        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.wrap(outputText.toString().getBytes(StandardCharsets.UTF_8));
            fileChannel.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            //написать и бросить исключение!!!!!!!
        }
    }


}
