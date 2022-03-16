package ru.javarush.drogunov.enity;

public class CharacterOffset {


    public static StringBuilder rearrange(char[] dataInput,String[] parameters) {
        StringBuilder outputText = new StringBuilder();

        for (char c : dataInput) {
            outputText.append(GeneratorNewChar.getNewChar(c, parameters[2]));
        }

        return outputText;
    }
}
