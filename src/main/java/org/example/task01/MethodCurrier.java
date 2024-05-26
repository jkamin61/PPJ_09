package org.example.task01;

public class MethodCurrier {
    public static void setValue(int value) {
        System.out.println("Value: " + value);
    }

    public static void setValue(float value) {
        System.out.println("Value: " + value);
    }
}
