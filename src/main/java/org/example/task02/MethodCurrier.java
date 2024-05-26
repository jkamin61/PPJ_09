package org.example.task02;

public class MethodCurrier {
    public static void setValue(int value) {
        System.out.println("Value before modification: " + value);
        value += 1;
        System.out.println("Value: " + value);
    }

    public static void setValue(float value) {
        System.out.println("Value before modification: " + value);
        value += 1;
        System.out.println("Value: " + value);
    }

    public static void setValue(Number number) {
        System.out.println("Value before modification: " + number.value);
        number.value += 1;
        System.out.println("Value: " + number.value);
    }
}
