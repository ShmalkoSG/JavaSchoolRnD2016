package ru.sbertech.test.Lesson7;

/**
 * Created by Student on 01.08.2016.
 */
public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Hello from Person");
    }

    private String name;
}