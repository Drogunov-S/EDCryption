package ru.javarush.drogunov.enity;

public class Result {

    private final String massage;
    private int key;
    private final ResultCode resultCode;


    public Result(String massage, ResultCode resultCode) {
        this.massage = massage;
        this.resultCode = resultCode;
    }

    public Result(String massage, ResultCode resultCode, int intKey) {
        this.massage = massage;
        this.resultCode = resultCode;
        this.key = intKey;
    }


    @Override
    public String toString() {
        return "Result{" +
                "massage='" + massage + '\'' +
                ", key=" + key +
                ", resultCode=" + resultCode +
                '}';
    }
}
