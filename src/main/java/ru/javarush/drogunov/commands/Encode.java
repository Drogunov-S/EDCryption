package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.data.DataInput;
import ru.javarush.drogunov.data.DataOutput;
import ru.javarush.drogunov.data.FileCreation;
import ru.javarush.drogunov.enity.*;

import java.nio.file.Path;

import static ru.javarush.drogunov.constant.Constants.TXT_FOLDER;

public class Encode implements Action {
    private final DataOutput dataOutput;

    public Encode() {
        dataOutput = new DataOutput();
    }


    @Override
    public Result execute(String[] parameters) {
        //TODO Как убрать дублирование кода в Encoder, BruteForce Только созданием нового класса?
        char[] dataInput = DataInput.read(parameters[0]);
        StringBuilder outputText = CharacterOffset.rearrange(dataInput ,parameters[2]);
        dataOutput.write(outputText, FileCreation.creation(Path.of(TXT_FOLDER + parameters[1])));

        return new Result("Encode all right", ResultCode.OK);
    }


}