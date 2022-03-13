package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.enity.Result;

public class Encoder extends Decoder implements Action {


    @Override
    public Result execute(String[] parameters) {
        int key = Integer.parseInt(parameters[2]);
        parameters[2] = String.valueOf(key * -1);
        return super.execute(parameters);
    }
}
