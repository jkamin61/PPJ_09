package org.example.task02;

public class Main {
    public static void main(String[] args) {
        Number number = new Number(10);
        MethodCurrier.setValue(number);
        number.setValue(20);
        number.showValue();
    }
}
