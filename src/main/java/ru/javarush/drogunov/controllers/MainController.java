package ru.javarush.drogunov.controllers;

import ru.javarush.drogunov.commands.Action;
import ru.javarush.drogunov.enity.Result;


/*
* Контроллер выбора режима работы программы
*
* */

public class MainController {
    public Result doAction(String actionName, String... parameters) {

    Action action = Actions.find(actionName);
    return action.execute(parameters);


      //Старый код до лекции 15.03.2022
       /* if (action == null) {
            throw new UncorrectedActionsExceptions("Введена пустая строка");
        }
        Result result = null;

        //Сделать ретурн красивее при помощи свитча
        try {
            switch (Actions.valueOf(action.toUpperCase())) {
                case DECODER -> result = new Decoder().execute(parameters);
                case ENCODER -> result = new Encoder().execute(parameters);
            }
        } catch (IllegalArgumentException e) {
            throw new UncorrectedActionsExceptions("Неизвестная команда", e);
        }

        //Не пойму почему все равно требует return? и как сделать что бы его не требовало?
        return result;*/
    }
}
