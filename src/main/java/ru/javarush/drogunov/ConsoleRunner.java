package ru.javarush.drogunov;

import ru.javarush.drogunov.enity.Result;

public class ConsoleRunner {

    public static void main(String[] args) {
        Applications applications = new Applications();
        Result result = applications.run(args);

        System.out.println(result.getResult().toString());

        args[3] = "-2";

        Result result1 = applications.run(args);

        System.out.println(result1.getResult().toString());


    }


}
