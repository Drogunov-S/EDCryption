package ru.javarush.drogunov.input;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class InputCharArrays {



    public static char[] read(String path) {
        char[] charFileToArray = null;
        //Не забыть перенести в константы
        Path path3 = Path.of("D:\\file2.txt");

        try (FileChannel fileChannel = FileChannel.open(path3, StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate((int) Files.size(path3));
            fileChannel.read(buffer);
            charFileToArray = new String(buffer.array(), StandardCharsets.UTF_8).toCharArray();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return charFileToArray;
    }
}