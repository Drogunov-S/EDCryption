package ru.javarush.drogunov.analysis;

import ru.javarush.drogunov.analysis.positions.RegexFind;
import ru.javarush.drogunov.analysis.positions.WordMatch;

public class Analyzer {
    private final RegexFind regexFind;
    private final WordMatch wordMatch;

    public Analyzer() {
        this.regexFind = new RegexFind();
        this.wordMatch = new WordMatch();
    }


    public int numberOfCoincidences(StringBuilder text) {

        int words = wordMatch.countWords(text);
        int regex = regexFind.count(text, regexFind.COMMA_AND_SPACE, regexFind.POINT_AND_SPACE, regexFind.NEW_LINE);

//        System.out.println((words + " words " +countCommaAndSpace+ " Comma " + countPointAndSpace) + " point");

        return words+regex;
    }


}
