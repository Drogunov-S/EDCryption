package ru.javarush.drogunov.constant;

/*
* Константы приложения используемые для проверки текста и смещения
*
* */

public class Constants {
    private static final String TASK_SYMBOLS = " .,”:-!?";
    private static final String MORE_SYMBOLS = "@#$%^&*()-_+={}[];\"<>`";
    public static final String SYMBOLS = TASK_SYMBOLS + MORE_SYMBOLS;

    private static final String ALPHABET_ENG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String ENG = ALPHABET_ENG + ALPHABET_ENG.toLowerCase();

    private static final String ALPHABET_RUS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String RUS = ALPHABET_RUS + ALPHABET_RUS.toLowerCase();


    public static final String ALL = SYMBOLS + ALPHABET_ENG + ALPHABET_RUS;

}
