package ru.sbertech.test.Lesson3.Examples;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
import ru.sbertech.test.Lesson3.Person;
import ru.sbertech.test.Lesson3.PersonFirstLoad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 18.07.2016.
 */
public class Example1_ArrayList {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);
        System.out.println("-----------------------");


        System.out.println(persons.contains(new Person (10L,"Бирюков Виктор Валерьевич", "8394957")));

    }
}

