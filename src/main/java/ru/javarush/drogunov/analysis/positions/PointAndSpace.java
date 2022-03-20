package ru.javarush.drogunov.analysis.positions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PointAndSpace {

    private Pattern regexPointAndSpace = Pattern.compile("\\. +[A-ZА-Я]");


    public boolean existence(StringBuilder text) {
        Matcher matcher = regexPointAndSpace.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count > text.length() % 300;
    }

    public int count(StringBuilder text) {
        Matcher matcher = regexPointAndSpace.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

}
