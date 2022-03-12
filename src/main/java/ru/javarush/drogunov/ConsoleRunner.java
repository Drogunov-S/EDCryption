package ru.javarush.drogunov;

import ru.javarush.drogunov.enity.Result;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ConsoleRunner {

    public static void main(String[] args) {
        Applications applications = new Applications();
        Result result = applications.run(args);


    }


}
