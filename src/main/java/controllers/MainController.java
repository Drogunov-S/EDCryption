package controllers;

import commands.Decoder;
import commands.Encoder;
import constant.Actions;
import enity.Result;
import exceptions.UncorrectedActionsExceptions;


/*
* Контроллер выбора режима работы программы
*
* */

public class MainController {
    public Result doAction(String action, String[] parameters) {
        if (action == null) {
            throw new UncorrectedActionsExceptions("Введена пустая строка");
        }

        try {
            switch (Actions.valueOf(action.toUpperCase())) {
                case DECODER -> new Decoder().execute(parameters);
                case ENCODER -> new Encoder().execute(parameters);
            }
        } catch (IllegalArgumentException e) {
            throw new UncorrectedActionsExceptions("Неизвестная команда", e);
        }

        //Не пойму почему все равно требует return? и как сделать что бы его не требовало?
        return null;
    }
}
