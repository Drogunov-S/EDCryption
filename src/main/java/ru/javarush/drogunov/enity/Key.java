package ru.javarush.drogunov.enity;


import ru.javarush.drogunov.analysis.Analyzer;
import ru.javarush.drogunov.constant.Constants;

public class Key {


    public int newKey(char[] dataInput) {
        Analyzer analyzer = new Analyzer();
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
