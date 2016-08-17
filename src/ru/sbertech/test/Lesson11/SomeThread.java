package ru.sbertech.test.Lesson11;

/**
 * Created by svetlanashmalko on 17.08.16.
 */
public class SomeThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm here!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I'm here again!");
    }
}