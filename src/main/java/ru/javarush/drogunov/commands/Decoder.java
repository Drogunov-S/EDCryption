package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.enity.GeneratorNewChar;
import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.enity.DataInput;

public class Decoder implements Action {


    @Override
    public Result execute(String[] parameters) {
        char[] dataInput = DataInput.read(parameters[0]);
        StringBuilder outputText = new StringBuilder();

        for (char c : dataInput) {
            outputText.append(GeneratorNewChar.getNewChar(c, parameters[2]));
        }

        return new Result(outputText);
    }


}