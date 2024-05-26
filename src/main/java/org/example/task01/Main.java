package org.example.task01;

public class Main {
    public static void main(String[] args) {
        MethodCurrier.setValue(1);
        MethodCurrier.setValue(1.0f);
        MethodCurrier.setValue('d');
        MethodCurrier.setValue(0b101);

        //Decyzja o wywolaniu metody jest zalezna od typu parametru. Jest to przeciazanie metod.
    }
}
