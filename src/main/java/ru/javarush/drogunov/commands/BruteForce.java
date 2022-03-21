package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.data.DataInput;
import ru.javarush.drogunov.data.DataOutput;
import ru.javarush.drogunov.data.FileCreation;
import ru.javarush.drogunov.enity.CharacterOffset;
import ru.javarush.drogunov.enity.Key;
import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.enity.ResultCode;

import java.nio.file.Path;

import static ru.javarush.drogunov.constant.Constants.TXT_FOLDER;

public class BruteForce implements Action {
    private final Key key;
    private final DataOutput dataOutput;

    public BruteForce() {
        this.key = new Key();
        dataOutput = new DataOutput();
    }

    @Override
    //parameters | 0 Path in | 1 Path out |
    public Result execute(String[] parameters) {

        char[] dataInput = DataInput.read(parameters[0]);
        int bestKey = key.newKey(dataInput);
        StringBuilder outputText = CharacterOffset.rearrange(dataInput, bestKey);
        dataOutput.write(outputText, FileCreation.creation(Path.of(TXT_FOLDER + parameters[1])));


        return new Result("BruteForce all right", ResultCode.OK, bestKey);
    }
}
