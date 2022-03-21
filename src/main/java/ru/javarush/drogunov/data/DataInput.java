package ru.javarush.drogunov.data;

import ru.javarush.drogunov.exceptions.AppExceptions;

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

import static ru.javarush.drogunov.constant.Constants.TXT_FOLDER;

/*
 * Класс из потока создает массив чаров и возвращает его
 *
 * */

public class DataInput {


    public static char[] read(String path) {
        Path pathInputToFile = Path.of(TXT_FOLDER + path);

        char[] charFileToArray = null;

        try (FileChannel fileChannel = FileChannel.open(pathInputToFile, StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate((int) Files.size(pathInputToFile));
            fileChannel.read(buffer);
            charFileToArray = new String(buffer.array(), StandardCharsets.UTF_8).toCharArray();
        } catch (IOException e) {
            throw new AppExceptions("Ошибка имени файла для чтения", e);
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
            throw new AppExceptions("Ошибка преобразования в HashSet", e);
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
            throw new AppExceptions("Ошибка преобразования в ArrayList", e);

        }

        return topWord;
    }
}