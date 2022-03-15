package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.enity.*;

public class Decoder implements Action {


    @Override
    public Result execute(String[] parameters) {
        DataInput dataInput2 = new DataInput(parameters[0]);
        //TODO Дописать объект дата

        char[] dataInput = DataInput.read(parameters[0]);
        StringBuilder outputText = new StringBuilder();

        for (char c : dataInput) {
            outputText.append(GeneratorNewChar.getNewChar(c, parameters[2]));
        }

        DataOutput dataOutput = new DataOutput(parameters[1]);
        dataOutput.write(outputText);

        return new Result("Decode all right", ResultCode.OK);
    }


}