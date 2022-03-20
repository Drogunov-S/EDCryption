package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.analysis.Analyzer;
import ru.javarush.drogunov.data.DataInput;
import ru.javarush.drogunov.data.DataOutput;
import ru.javarush.drogunov.enity.CharacterOffset;
import ru.javarush.drogunov.enity.Key;
import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.enity.ResultCode;
import ru.javarush.drogunov.exceptions.AppExceptions;

public class BruteForce implements Action {

    @Override
    //parameters | 0 Path in | 1 Path out |
    public Result execute(String[] parameters) {
        Key key = new Key();

        char[] dataInput = DataInput.read(parameters[0]);
        int bestKey = key.newKey(dataInput);
        StringBuilder outputText = CharacterOffset.rearrange(dataInput, bestKey);
        DataOutput dataOutput = new DataOutput(parameters[1]);
        dataOutput.write(outputText);


        return new Result("BruteForce all right", ResultCode.OK, bestKey);
    }
}
