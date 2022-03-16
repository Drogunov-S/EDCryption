package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.data.DataInput;
import ru.javarush.drogunov.data.DataOutput;
import ru.javarush.drogunov.enity.*;

public class Decoder implements Action {


    @Override
    public Result execute(String[] parameters) {
        //TODO Дописать объект дата
        //TODO Как убрать дублирование куда в Encoder
        char[] dataInput = DataInput.read(parameters[0]);
        StringBuilder outputText = CharacterOffset.rearrange(dataInput ,parameters);
        DataOutput dataOutput = new DataOutput(parameters[1]);
        dataOutput.write(outputText);

        return new Result("Decode all right", ResultCode.OK);
    }


}