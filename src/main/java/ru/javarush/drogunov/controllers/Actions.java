package ru.javarush.drogunov.controllers;

/*
 * Действия, которые умеет программа
 * DECODER - зашифровать
 * ENCODER - расшифровать
 * BRUTE_FORCE - взломать методом грубой силы
 * STATISTICS_METHOD - взломать методом статистического анализа
 * */

import ru.javarush.drogunov.commands.Action;
import ru.javarush.drogunov.commands.BruteForce;
import ru.javarush.drogunov.commands.Decoder;
import ru.javarush.drogunov.commands.Encoder;
import ru.javarush.drogunov.exceptions.AppExceptions;

public enum Actions {
    DECODER(new Decoder()),
    ENCODER(new Encoder()),
    BRUTE_FORCE(new BruteForce()),
    /*STATISTICS_METHOD*/;

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
        try {
            Actions value = Actions.valueOf((actionName.toUpperCase()));
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppExceptions("Некорректный ввод команды");
        }
    }
}
