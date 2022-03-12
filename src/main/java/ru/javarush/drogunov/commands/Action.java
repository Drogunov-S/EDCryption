package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.enity.Result;

public interface Action {
    public Result execute(String[] parameters);


}
