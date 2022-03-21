package ru.javarush.drogunov.enity;


import ru.javarush.drogunov.analysis.Analyzer;
import ru.javarush.drogunov.constant.Constants;

import java.util.Arrays;

public class Key {
    private final Analyzer analyzer;

    public Key() {
        this.analyzer = new Analyzer();
    }


    public int newKey(char[] dataInput) {
        if (dataInput.length > 10000) {
            dataInput = Arrays.copyOfRange(dataInput, 0, 10000);
        }



        int bestKey = 0;
        int bestCount = 0;

        for (int key = 0 ;key < Constants.SIZE_ALL ; key++) {
            int count = analyzer.numberOfCoincidences(CharacterOffset.rearrange(dataInput, key));

            if (count > bestCount) {
                bestCount = count;
                bestKey = key;
            }
        }
        return bestKey;
    }
}
