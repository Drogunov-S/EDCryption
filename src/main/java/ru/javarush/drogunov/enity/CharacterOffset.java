package ru.javarush.drogunov.enity;

import ru.javarush.drogunov.constant.Constants;

public class CharacterOffset {


    public static StringBuilder rearrange(char[] dataInput,String key) {
        StringBuilder outputText = new StringBuilder();

        for (char c : dataInput) {
            outputText.append(GeneratorNewChar.getNewChar(c, key, Constants.listCharsAlphabet(Constants.ALL)));
        }

        return outputText;
    }

    public static StringBuilder rearrange(char[] dataInput,int key) {
        StringBuilder outputText = new StringBuilder();

        for (char c : dataInput) {
            outputText.append(GeneratorNewChar.getNewChar(c, key, Constants.listCharsAlphabet(Constants.ALL)));
        }

        return outputText;
    }


}
