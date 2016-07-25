package ru.sbertech.test.Lesson4.Homework;

/**
 * Created by svetlanashmalko on 24.07.16.
 */
public class TestMyLinkedList {
    public static void main(String[] args){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Helo!");
        myLinkedList.add("World)))");
        myLinkedList.add(1,"Super");

        System.out.println(myLinkedList.get(1));
    }
}
