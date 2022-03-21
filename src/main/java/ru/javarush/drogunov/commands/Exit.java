package ru.javarush.drogunov.commands;

import ru.javarush.drogunov.enity.Result;
import ru.javarush.drogunov.enity.ResultCode;

public class Exit implements ActionExit{


    //TODO Вот тут получается не очень красиво, сделать отдельный интерфейс? или как разделить их?
    @Override
    public Result execute(String[] parameters) {
        return new Result("Exit program", ResultCode.ERROR);

    }

    @Override
    public Result execute() {
        return new Result("Exit program", ResultCode.ERROR);

    }
}
