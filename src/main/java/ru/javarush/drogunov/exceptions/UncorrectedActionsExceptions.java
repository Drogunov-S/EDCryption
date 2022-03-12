package ru.javarush.drogunov.exceptions;

public class UncorrectedActionsExceptions extends RuntimeException {

    public UncorrectedActionsExceptions(String message) {
        super(message);
    }

    public UncorrectedActionsExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
