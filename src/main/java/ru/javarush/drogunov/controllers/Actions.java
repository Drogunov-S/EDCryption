package ru.javarush.drogunov.controllers;

/*
 * Действия, которые умеет программа
 * DECODER - зашифровать
 * ENCODER - расшифровать
 * BRUTE_FORCE - взломать методом грубой силы
 * STATISTICS_METHOD - взломать методом статистического анализа
 * */

import ru.javarush.drogunov.commands.*;
import ru.javarush.drogunov.exceptions.AppExceptions;

public enum Actions {
    EXIT(new Exit()),
    DECODE(new Decode()),
    ENCODE(new Encode()),
    BRUTE_FORCE(new BruteForce()),
    STATISTICS_METHOD(new StatisticsMethod());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
        //TODO Как лучше написать проверку ввода?
        if (actionName.equalsIgnoreCase("BruteForce")) {
            actionName = "Brute_Force";
        }

        try {
            Actions value = Actions.valueOf((actionName.toUpperCase()));
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppExceptions("Некорректный ввод команды");
        }
    }
    public static String find(int numberCommand) {
        Actions value = Actions.values()[numberCommand];
        return value.toString();
    }
}
