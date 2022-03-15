package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.enity.Result;

public class Encoder implements Action {


    public Result execute(String[] parameters) {
        int key = Integer.parseInt(parameters[2]);
        parameters[2] = String.valueOf(key * -1);


        return new Decoder().execute(parameters);
    }
}
