package ru.sbertech.test.Lesson3.Examples;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
import ru.sbertech.test.Lesson3.Person;
import ru.sbertech.test.Lesson3.PersonFirstLoad;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Student on 18.07.2016.
 */
public class Example3_TreeSet {

    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);

        System.out.println("size = " + persons.size());

    }
}
