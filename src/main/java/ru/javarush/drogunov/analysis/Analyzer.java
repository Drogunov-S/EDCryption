package ru.javarush.drogunov.analysis;

import ru.javarush.drogunov.analysis.positions.CommaAndSpace;
import ru.javarush.drogunov.analysis.positions.PointAndSpace;
import ru.javarush.drogunov.analysis.positions.WordMatch;

public class Analyzer {
    private final PointAndSpace pointAndSpace;
    private final CommaAndSpace commaAndSpace;
    private final WordMatch wordMatch;

    public Analyzer() {
        this.pointAndSpace = new PointAndSpace();
        this.commaAndSpace = new CommaAndSpace();
        this.wordMatch = new WordMatch();
    }


    public boolean analysis(StringBuilder text) {
        if (text == null) {
            return true;
        }
        //TODO попробовать сделать декоратор
        return text.length() < 20 ? smallText(text) : bigText(text);
    }

    public int numberOfCoincidences(StringBuilder text) {
        int words = wordMatch.countWords(text);
        int countPointAndSpace = pointAndSpace.count(text);
        int countCommaAndSpace = commaAndSpace.count(text);

        return words/*+countCommaAndSpace+countPointAndSpace*/;
    }

    private boolean smallText(StringBuilder text) {
        return commaAndSpace.existence(text) && pointAndSpace.existence(text);
    }

    private boolean bigText(StringBuilder text) {
        return wordMatch.isContains(text) || commaAndSpace.existence(text) && pointAndSpace.existence(text);
    }

}
