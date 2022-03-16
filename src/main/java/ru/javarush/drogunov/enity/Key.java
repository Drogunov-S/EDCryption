package ru.javarush.drogunov.enity;

import ru.javarush.drogunov.data.DataInput;

import java.util.HashSet;

import static ru.javarush.drogunov.constant.Constants.TOP_WORDS;

public class Key {
    private String stringKey;
    private int key = 0;

    public Key(String stringKey){
        this.stringKey = stringKey;
        key = Integer.parseInt(stringKey);
    }

    public Key(){

    }

    public int newKey() {
        key--;

        return key;
    }


}
