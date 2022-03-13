package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.constant.Constants;
import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.enity.DataInput;

import java.util.ArrayList;

public class Decoder implements Action {


    @Override
    public Result execute(String[] parameters) {
        char[] dataInput = DataInput.read(parameters[0]);
        StringBuilder outputText = new StringBuilder();


        for (char c : dataInput) {
            outputText.append(getNewChar(c, parameters[2]));
        }


        return new Result(outputText);
    }

    //Нужно сделать проверки на конец массива, что бы последний символы менялись, и при круге более 1го
    private char getNewChar(char oldChar, String parameterKey) {
        ArrayList<Character> alphabet = Constants
                .listCharsAlphabet(Constants.ENG, Constants.RUS, Constants.
                        SYMBOLS);

        if (!alphabet.contains(oldChar)) {
            return oldChar;
        }

        int indexOldChar = alphabet.indexOf(oldChar);
        int indexNewChar = getIndexNewChar(parameterKey, indexOldChar, alphabet.size());


        /*if (key + indexOldChar > alphabet.size()) {
            indexNewChar = (key + indexOldChar) - alphabet.size();
            return alphabet.get(indexNewChar);
        }*/
        /*indexNewChar = indexOldChar + key;*/

        return alphabet.get(indexNewChar);
        //Вариант 1, но проблемы с проверкой чара в конце константы и при больших ключах
        //return ALL.charAt(ALL.indexOf(ALL.indexOf(oldChar) + Integer.parseInt(parameterKey)));
    }

    private int getIndexNewChar(String parameterKey, int indexOldChar, int alphabetSize) {
        int key = Integer.parseInt(parameterKey);

        if (key > alphabetSize) {
            key %= alphabetSize;
        }

        if (key + indexOldChar > alphabetSize) {
            return (key + indexOldChar) - alphabetSize;
        }

        return key + indexOldChar;

    }


}
//realise class Result, Decoder. Rename class name in package input.