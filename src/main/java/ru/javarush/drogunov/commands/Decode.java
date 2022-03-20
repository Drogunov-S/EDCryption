package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.data.DataInput;
import ru.javarush.drogunov.data.DataOutput;
import ru.javarush.drogunov.enity.*;

public class Decode implements Action {


    public Result execute(String[] parameters) {
        int key = Integer.parseInt(parameters[2]);
        parameters[2] = String.valueOf(key * -1);

        char[] dataInput = DataInput.read(parameters[0]);
        StringBuilder outputText = CharacterOffset.rearrange(dataInput ,parameters[2]);
        DataOutput dataOutput = new DataOutput(parameters[1]);
        dataOutput.write(outputText);

        return new Result("Decode all right", ResultCode.OK);
    }
}
