package ru.javarush.drogunov;

import ru.javarush.drogunov.constant.Constants;
import ru.javarush.drogunov.controllers.MainController;
import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.exceptions.AppExceptions;
import java.util.Arrays;

import static ru.javarush.drogunov.constant.ConstantsText.NOT_ARGUMENT;
import static ru.javarush.drogunov.constant.ConstantsText.START_CONSOLE_MENU;

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
        } else {
            System.out.println(NOT_ARGUMENT);
            System.out.println(START_CONSOLE_MENU);
            ConsoleMenu consoleMenu = new ConsoleMenu();
            return consoleMenu.startMenu(mainController);
        }
    }
}
