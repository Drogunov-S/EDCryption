package ru.javarush.drogunov.analysis.positions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFind {

    public final Pattern COMMA_AND_SPACE = Pattern.compile("\\, +[A-Za-zА-Яа-я]");
    public final Pattern POINT_AND_SPACE = Pattern.compile("\\. +[A-ZА-Я]");
//    public final Pattern POINT_AND_QUESTION = Pattern.compile("\\. +[?]");
    public final Pattern NEW_LINE = Pattern.compile("\n +[A-ZА-Я]");

/*
    public boolean existence(StringBuilder text) {
        Matcher matcher = COMMA_AND_SPACE.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count > text.length() % 300;
    }*/

    public int count(StringBuilder text, Pattern... patterns) {
        int count = 0;
        for (Pattern pattern : patterns) {
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }
}

