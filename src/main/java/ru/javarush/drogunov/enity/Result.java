package ru.javarush.drogunov.enity;

public class Result {
    private final StringBuilder stringBuilder;

    public Result(StringBuilder result) {
        this.stringBuilder = result;

    }

    public StringBuilder getResult() {
        return stringBuilder;
    }
}
