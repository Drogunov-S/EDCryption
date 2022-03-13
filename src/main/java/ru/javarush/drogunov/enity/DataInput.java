package ru.javarush.drogunov.enity;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

/*
* Класс из потока создает массив чаров и возвращает его
*
* */


public class DataInput {





    public static char[] read(String path) {
        char[] charFileToArray = null;
        //Не забыть перенести в константы
        //Path path3 = Path.of("D:\\file2.txt");
        Path path3 = Path.of(path);

        try (FileChannel fileChannel = FileChannel.open(path3, StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate((int) Files.size(path3));
            fileChannel.read(buffer);
            charFileToArray = new String(buffer.array(), StandardCharsets.UTF_8).toCharArray();
        } catch (IOException e) {
            e.printStackTrace();
            //написать и бросить исключение!!!!!!!
        }



        return charFileToArray;
    }

//Метод не используется
    /*private static ArrayList<Character> ArrayCharToArrayList(char[] array) {
        ArrayList<Character> arrayList = new ArrayList<>();

        for (char c : array) {
            arrayList.add(c);
        }

        return arrayList;
    }*/
}