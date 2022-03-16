package ru.javarush.drogunov.data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;

/*
 * Класс из потока создает массив чаров и возвращает его
 *
 * */


public class DataInput {

    private Path path;

    //Проход названия файла
    public DataInput(String fileName) {

    }

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


    public static HashSet<String> readToHashSet(Path path) {
        HashSet<String> topWord = new HashSet<>();


        try (BufferedReader readerWords = new BufferedReader(new InputStreamReader(new FileInputStream(path.toFile())))) {

            while (readerWords.ready()) {
                topWord.add(readerWords.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
            //написать и бросить исключение!!!!!!!
        }

        return topWord;
    }

    public static ArrayList<String> readToArrayList(Path path) {
        ArrayList<String> topWord = new ArrayList<>();


        try (BufferedReader readerWords = new BufferedReader(new InputStreamReader(new FileInputStream(path.toFile())))) {

            while (readerWords.ready()) {
                topWord.add(readerWords.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
            //написать и бросить исключение!!!!!!!
        }

        return topWord;
    }
}