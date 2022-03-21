package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.data.DataInput;
import ru.javarush.drogunov.data.DataOutput;
import ru.javarush.drogunov.data.FileCreation;
import ru.javarush.drogunov.enity.*;

import java.nio.file.Path;

import static ru.javarush.drogunov.constant.Constants.TXT_FOLDER;

public class Decode implements Action {
    private final DataOutput dataOutput;

    public Decode() {
        dataOutput = new DataOutput();
    }


    public Result execute(String[] parameters) {
        int key = Integer.parseInt(parameters[2]);
        parameters[2] = String.valueOf(key * -1);

        char[] dataInput = DataInput.read(parameters[0]);
        StringBuilder outputText = CharacterOffset.rearrange(dataInput ,parameters[2]);
        dataOutput.write(outputText, FileCreation.creation(Path.of(TXT_FOLDER + parameters[1])));

        return new Result("Decode all right", ResultCode.OK);
    }
}
