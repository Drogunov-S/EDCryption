package ru.javarush.drogunov;

import ru.javarush.drogunov.commands.Exit;
import ru.javarush.drogunov.controllers.Actions;
import ru.javarush.drogunov.controllers.MainController;
import ru.javarush.drogunov.enity.Result;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import static ru.javarush.drogunov.constant.Constants.TXT_FOLDER;
import static ru.javarush.drogunov.constant.ConstantsText.*;

/*
* Запуск консольной версии меню
* */

public class ConsoleMenu {


    public Result startMenu(MainController mainController) {
        ArrayList<String> arguments = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(NOT_ARGUMENT);
            System.out.println(START_CONSOLE_MENU);
            System.out.println(MENU);
            String action = Actions.find(Integer.parseInt(scanner.next()));
            if (action.equalsIgnoreCase("exit")) {
                return new Exit().execute();
            }
            String readFile;
            do {
                System.out.println(READ_FILE_NAME);
                readFile = scanner.next();
            } while (Files.notExists(Path.of(TXT_FOLDER + readFile)));
            arguments.add(readFile);

            System.out.println(WRITE_FILE_NAME);
            arguments.add(scanner.next());

            if (action.equalsIgnoreCase(Actions.values()[3].toString())
                    || action.equalsIgnoreCase(Actions.values()[4].toString())) {
                return mainController.doAction(action, arguments.toArray(new String[arguments.size()]));
            }

            System.out.println(KEY);
            arguments.add(scanner.next());

            return mainController.doAction(action, arguments.toArray(new String[arguments.size()]));
        }
    }


}
