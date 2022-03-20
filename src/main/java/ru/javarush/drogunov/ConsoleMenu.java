package ru.javarush.drogunov;

import ru.javarush.drogunov.commands.Exit;
import ru.javarush.drogunov.controllers.Actions;
import ru.javarush.drogunov.controllers.MainController;
import ru.javarush.drogunov.enity.Result;

import java.util.ArrayList;
import java.util.Scanner;

import static ru.javarush.drogunov.constant.ConstantsText.*;

public class ConsoleMenu {


    public Result startMenu(MainController mainController) {
        ArrayList<String> arguments = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(MENU);
            String action = Actions.find(Integer.parseInt(scanner.next()));
            if (action.equalsIgnoreCase("exit")) {
                return new Exit().execute();
            }
            System.out.println(READ_FILE_NAME);
            arguments.add(scanner.next());

            if (action.equalsIgnoreCase(Actions.values()[3].toString())
                    || action.equalsIgnoreCase(Actions.values()[4].toString())) {
                return mainController.doAction(action, arguments.get(0));
            }

            System.out.println(WRITE_FILE_NAME);
            arguments.add(scanner.next());

            System.out.println(KEY);
            arguments.add(scanner.next());

            return mainController.doAction(action, arguments.toArray(new String[arguments.size()]));
        }
    }


}
