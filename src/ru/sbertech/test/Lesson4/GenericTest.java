package ru.sbertech.test.Lesson4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 21.07.2016.
 */
public class GenericTest {
    public static void main(String[] args) {
        A<List> a = new A<>();
        a.setParam1(new ArrayList<String>());
        A<String> aString = new A<>();
        aString.setParam1(new String());
        System.out.println(a.getType());
        System.out.println(aString.getType());

        System.out.println(B.<Integer>getType(new Integer(10)));


    }
}
