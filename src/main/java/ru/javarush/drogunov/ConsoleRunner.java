package ru.javarush.drogunov;

import ru.javarush.drogunov.enity.DataOutput;
import ru.javarush.drogunov.enity.Result;

public class ConsoleRunner {

    public static void main(String[] args) {

//        System.out.println(-1000 % 148);
        long timeStart = System.nanoTime();

        Applications applications = new Applications();
        Result result = applications.run(args);

        long timeEnd = System.nanoTime();
        System.out.println((timeEnd - timeStart) / 10_000_000);
        System.out.println(result.toString());

        /*System.out.println(result.getResult().toString());

        args[0] = "Encoder";
        args[3] = "-1000";

        Result result1 = applications.run(args);

        System.out.println(result1.getResult().toString());*/


    }


}
