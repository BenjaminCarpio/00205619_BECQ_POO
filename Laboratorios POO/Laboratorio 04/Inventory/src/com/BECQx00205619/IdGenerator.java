package com.BECQx00205619;

public final class IdGenerator {
    private static int counter = 0;
    private IdGenerator() {}

    public static int newId(){
        return ++counter;
    }
}