package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.enity.ResultCode;

public class StatisticsMethod implements Action {

    @Override
    public Result execute(String[] parameters) {
        return new Result("StatisticsMethod not realise, I am so sorry, i am just learning", ResultCode.ERROR);
    }
}
