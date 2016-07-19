package ru.sbertech.test.Lesson3.Examples;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
import ru.sbertech.test.Lesson3.Person;
import ru.sbertech.test.Lesson3.PersonFirstLoad;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Student on 18.07.2016.
 */
public class Example5_Map {
    public static void main(String[] args) {
        Map<String,Person> persons = new HashMap<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);

        System.out.println("size = " + persons.size());

        System.out.println(persons.get("16"));

    }
}