package ru.sbertech.test.Lesson4;

/**
 * Created by Student on 21.07.2016.
 */
public class B {
    public static <T> String getType(T obj){
        return obj.getClass().getTypeName();
    }
}
