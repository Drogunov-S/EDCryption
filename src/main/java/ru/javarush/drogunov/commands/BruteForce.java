package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.analyzers.WordMatch;
import ru.javarush.drogunov.data.DataInput;
import ru.javarush.drogunov.data.DataOutput;
import ru.javarush.drogunov.enity.CharacterOffset;
import ru.javarush.drogunov.enity.Key;
import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.enity.ResultCode;

public class BruteForce implements Action {

    @Override
    //parameters | 0 Path in | 1 Path out |
    public Result execute(String[] parameters) {
        Key key = new Key();

        char[] dataInput = DataInput.read(parameters[0]);

        StringBuilder outputText = null;
        int intKey = 0;
        while (WordMatch.isContains(outputText)) {
            intKey = key.newKey();
            outputText = CharacterOffset.rearrange(dataInput, intKey);
            if (intKey > 149) {
                break;
            }
        }

        DataOutput dataOutput = new DataOutput(parameters[1]);
        dataOutput.write(outputText);


        return new Result("Encoder all right", ResultCode.OK, intKey);
    }
}
