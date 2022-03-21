package ru.javarush.drogunov;

import ru.javarush.drogunov.data.DataInput;
import ru.javarush.drogunov.enity.Result;

import static ru.javarush.drogunov.constant.Constants.TOP_WORDS;

public class ConsoleRunner {

    public static void main(String[] args) {


        long timeStart = System.nanoTime();

        Applications applications = new Applications();
        Result result = applications.run(args);

        long timeEnd = System.nanoTime();
        System.out.println((timeEnd - timeStart) / 10_000_000);
        System.out.println(result.toString());



    }


}
