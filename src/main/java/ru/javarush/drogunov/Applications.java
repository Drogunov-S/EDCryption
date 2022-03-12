package ru.javarush.drogunov;

import ru.javarush.drogunov.controllers.MainController;
import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.exceptions.AppExceptions;
import java.util.Arrays;

/*
* Запуск приложения если String[] args > 0; (19)
* */

public class Applications {
    private final MainController mainController;

    public Applications() {
        mainController = new MainController();
    }


    public Result run(String[] args) {
        if(args.length > 0) {
            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);
            return mainController.doAction(action, parameters);
        }
        throw new AppExceptions("Ошибка в водимых данных (Input error)");


    }
}
