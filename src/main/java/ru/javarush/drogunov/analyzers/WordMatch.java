package ru.javarush.drogunov.analyzers;

import ru.javarush.drogunov.data.DataInput;

import java.util.ArrayList;
import java.util.HashSet;

import static ru.javarush.drogunov.constant.Constants.TOP_WORDS;

public class WordMatch {
    private static final ArrayList<String> topWord = DataInput.readToArrayList(TOP_WORDS);


    public static boolean isContains(StringBuilder text) {
        if (text == null) {
            return true;
        }


        int count = 0;

        for (String s : topWord) {
            if (text.indexOf(s) > -1) {
                count++;
            }
            if (count > 40) {
                return false;
            }
        }

        return true;
    }

}
