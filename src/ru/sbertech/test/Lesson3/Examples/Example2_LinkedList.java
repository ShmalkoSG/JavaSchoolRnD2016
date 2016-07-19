package ru.sbertech.test.Lesson3.Examples;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
import ru.sbertech.test.Lesson3.Person;
import ru.sbertech.test.Lesson3.PersonFirstLoad;

import java.util.LinkedList;

/**
 * Created by Student on 18.07.2016.
 */
public class Example2_LinkedList {
    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();
        PersonFirstLoad.init(persons);
        //PersonFirstLoad.print(persons);
        System.out.println(persons.peek().toString());
        System.out.println(persons.poll().toString());
        System.out.println(persons.poll().toString());
        System.out.println(persons.pop().toString());
        System.out.println(persons.pop().toString());
        System.out.println(persons.pop().toString());
        persons.push(new Person (10L,"Бирюков Виктор Валерьевич", "8394957"));
        System.out.println(persons.poll().toString());
        System.out.println(persons.poll().toString());



    }
}

