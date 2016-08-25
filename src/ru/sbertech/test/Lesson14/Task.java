package ru.sbertech.test.Lesson14;

/**
 * Created by Student on 25.08.2016.
 */
public class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("thread "+ Thread.currentThread().getId() );
    }
}
