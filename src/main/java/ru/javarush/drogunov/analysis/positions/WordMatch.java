package ru.javarush.drogunov.analysis.positions;

import ru.javarush.drogunov.data.DataInput;

import java.util.*;

import static ru.javarush.drogunov.constant.Constants.TOP_WORDS;

public class WordMatch {
    private final ArrayList<String> topWord = DataInput.readToArrayList(TOP_WORDS);
    private final Set<String> setTopWord = DataInput.readToHashSet(TOP_WORDS);


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
//        long startTime = System.nanoTime();

        if (text == null) {
            return 0;
        }
        if (text.length() < 2) {
            return 0;
        }
        Set<String> words= new HashSet<>(Arrays.asList(text.toString().split(" ")));

        int count = 0;

        for (String s : setTopWord) {
            if (words.contains(s)) {
                count++;
            }
        }


   /*     for (String s : topWord) {
            if (text.indexOf(s) > -1) {
                count++;
            }
        }*/
        /*long endTime = System.nanoTime();
        System.out.println(" time  words - " + ((endTime - startTime) / 10_000 ));*/

        return count;
    }

}
