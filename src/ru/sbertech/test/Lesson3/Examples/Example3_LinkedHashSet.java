package ru.sbertech.test.Lesson3.Examples;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
import ru.sbertech.test.Lesson3.Person;
import ru.sbertech.test.Lesson3.PersonFirstLoad;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Student on 18.07.2016.
 */
public class Example3_LinkedHashSet {

    public static void main(String[] args) {
        Set<Person> persons = new LinkedHashSet<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);

        System.out.println("size = " + persons.size());

    }
}

