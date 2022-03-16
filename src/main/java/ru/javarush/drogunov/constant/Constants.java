package ru.javarush.drogunov.constant;

/*
* Константы приложения используемые для проверки текста и смещения
*
* */

import java.nio.file.Path;
import java.util.ArrayList;

public class Constants {
    private static final String TASK_SYMBOLS = " .,”:-!?";
    private static final String MORE_SYMBOLS = "@#$%^&*()_+={}[];\"<>`";
    public static final String SYMBOLS = TASK_SYMBOLS + MORE_SYMBOLS;

    private static final String ALPHABET_ENG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String ENG = ALPHABET_ENG + ALPHABET_ENG.toLowerCase();

    private static final String ALPHABET_RUS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String RUS = ALPHABET_RUS + ALPHABET_RUS.toLowerCase();

    public static final String ALL = SYMBOLS + ALPHABET_ENG + ALPHABET_RUS;

    public static final Path TOP_WORDS = Path.of("src\\main\\java\\ru\\javarush\\drogunov\\analyzers\\TopRusWords.txt").toAbsolutePath();

    //TODO Не забыть занести путь в константы

    public static ArrayList<Character> listCharsAlphabet(String... constants) {
        ArrayList<Character> allChars = new ArrayList<>();

        for (String str : constants) {
            for (int i = 0; i < str.length(); i++) {
                allChars.add(str.charAt(i));
            }
        }

        return allChars;
    }
}
