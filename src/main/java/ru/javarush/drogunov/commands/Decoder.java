package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.input.InputStreamToCharArray;

import static ru.javarush.drogunov.constant.Constants.ALL;

public class Decoder implements Action {



    @Override
    public Result execute(String[] parameters) {
        char[] input = InputStreamToCharArray.read(parameters[0]);
        StringBuilder outputText = new StringBuilder();



        for (int i = 0; i < input.length; i++) {
            outputText.append(getNewChar(input[i], parameters[2]));
        }



        return new Result(outputText);
    }
//Нужно сделать проверки на конец массива, что бы последний символы менялись, и при круге более 1го
    private char getNewChar(char oldChar, String key) {
        return ALL.charAt(ALL.indexOf(ALL.indexOf(oldChar) + Integer.parseInt(key)));
    }

}