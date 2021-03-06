package ru.javarush.drogunov.enity;

import ru.javarush.drogunov.constant.Constants;
import java.util.ArrayList;

public class GeneratorNewChar {

    public static char getNewChar(char oldChar, String key, ArrayList<Character> alphabet) {
        int keyInt = Integer.parseInt(key);

        if (!alphabet.contains(oldChar)) {
            return oldChar;
        }

        int indexOldChar = alphabet.indexOf(oldChar);
        int indexNewChar = NewIndex.get(keyInt, indexOldChar, alphabet.size());

        return alphabet.get(indexNewChar);
    }

    public static char getNewChar(char oldChar, int key, ArrayList<Character> alphabet) {


        if (!alphabet.contains(oldChar)) {
            return oldChar;
        }

        int indexOldChar = alphabet.indexOf(oldChar);
        int indexNewChar = NewIndex.get(key, indexOldChar, alphabet.size());

        return alphabet.get(indexNewChar);
    }


    private static class NewIndex {

        public static int get(int key, int indexOldChar, int alphabetSize) {

            if (key > 0) {
                return getPositive(key, indexOldChar, alphabetSize);
            } else {
                return getNegative(key, indexOldChar, alphabetSize);
            }

        }


        private static int getPositive(int key, int indexOldChar, int alphabetSize) {
            if (key >= alphabetSize) {
                key %= alphabetSize;
            }
            if (key + indexOldChar >= alphabetSize) {
                return (key + indexOldChar) - alphabetSize;
            }

            return indexOldChar + key;

        }

        private static int getNegative(int key, int indexOldChar, int alphabetSize) {
            if (key <= alphabetSize * -1) {
                key %= alphabetSize;
            }

            return Math.abs(((key + indexOldChar) + alphabetSize) % alphabetSize);


        }


    }
}
//key -112
//пробел 118
//'о' анг 106
//Ё = 6


/*
old 6
new 106 (eng o)

* */

/*
Копирование содержимого с использованием файловых каналов
Отображение файла может быть очень полезным, но оно не обязательно освободит вас от выполнения дополнительной работы. Например, предположим, что вы отображаете файл для получения удобного доступа к нескольким последним байтам файла. В этой ситуации вы должны выполнить определенное количество дополнительной работы, например, поиск конца файла и чтение блока файла в оперативную память. Эту работу обойти нельзя. Но отображение, безусловно, удобно и, иногда, оно может работать быстрее, чем альтернативные подходы. Например, отображение может помочь вам избежать копий буфера, или накладных расходов на системные вызовы.

private static int get(String parameterKey, int indexOldChar, int alphabetSize) {
            int key = Integer.parseInt(parameterKey);

            if (key > alphabetSize || key < alphabetSize * -1) {
                key %= alphabetSize;
            }
            if (key + indexOldChar > alphabetSize) {
                return (key + indexOldChar) - alphabetSize;
            } else if (key + indexOldChar < alphabetSize * -1) {
                return key + alphabetSize + indexOldChar;
            }
            int newIndexChar = Math.abs(key + indexOldChar);

            return newIndexChar == alphabetSize ? indexOldChar : newIndexChar;
        }

* */