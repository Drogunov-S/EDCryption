package ru.javarush.drogunov.analysis.positions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommaAndSpace {

    private Pattern regexCommaAndSpace = Pattern.compile("\\, +[A-Za-zА-Яа-я]");


    public boolean existence(StringBuilder text) {
        Matcher matcher = regexCommaAndSpace.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count > text.length() % 300;
    }

    public int count(StringBuilder text) {
        Matcher matcher = regexCommaAndSpace.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}

