package org.example.task04;

public class Person {
    String name;
    String surname;
    int yearOfBirth;

    public Person(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Year of birth: " + yearOfBirth);
    }
}
