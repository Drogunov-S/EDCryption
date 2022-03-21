package ru.javarush.drogunov.controllers;

import ru.javarush.drogunov.commands.Action;
import ru.javarush.drogunov.enity.Result;


/*
* Контроллер выбора режима работы программы
*
* */

public class MainController {
    public Result doAction(String actionName, String[] parameters) {

    Action action = Actions.find(actionName);
    return action.execute(parameters);

    }
}
