package ru.javarush.drogunov.exceptions;

public class AppExceptions extends RuntimeException {
    public AppExceptions(String message) {
        super(message);
    }

    public AppExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
