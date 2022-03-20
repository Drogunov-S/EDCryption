package ru.javarush.drogunov.analysis.positions;

import ru.javarush.drogunov.data.DataInput;

import java.util.ArrayList;

import static ru.javarush.drogunov.constant.Constants.TOP_WORDS;

public class WordMatch {
    private final ArrayList<String> topWord = DataInput.readToArrayList(TOP_WORDS);


    public boolean isContains(StringBuilder text) {
        if (text == null) {
            return true;
        }
        if (text.length() < 2) {
            return true;
        }

        int count = 0;

        for (String s : topWord) {
            if (text.indexOf(s) > -1) {
                count++;
            }
            if (count > text.length() % 300) {
                return true;
            }
        }

        return false;
    }

    public int countWords(StringBuilder text) {
        if (text == null) {
            return 0;
        }
        if (text.length() < 2) {
            return 0;
        }

        int count = 0;

        for (String s : topWord) {
            if (text.indexOf(s) > -1) {
                count++;
            }
        }

        return count;
    }

}
