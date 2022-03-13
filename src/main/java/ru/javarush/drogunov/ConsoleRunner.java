package ru.javarush.drogunov;

import ru.javarush.drogunov.enity.Result;

public class ConsoleRunner {

    public static void main(String[] args) {

//        System.out.println(-1000 % 148);


        Applications applications = new Applications();
        Result result = applications.run(args);

        System.out.println(result.getResult().toString());

        args[0] = "Encoder";
        args[3] = "-1000";

        Result result1 = applications.run(args);

        System.out.println(result1.getResult().toString());


    }


}
