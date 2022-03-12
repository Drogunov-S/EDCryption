package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.input.InputCharArrays;

public class Decoder implements Action {



    @Override
    public Result execute(String[] parameters) {
        InputCharArrays.read(parameters[0]);




        return null;
    }
}