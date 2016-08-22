package ru.sbertech.test.Lesson11;

/**
 * Created by Student on 15.08.2016.
 */
public class Main {
    public static void main(String[] args) {
       SomeTask st=new SomeTask();
        Thread t = new Thread(st);
        t.start();
        System.out.println("End");
        System.out.println("1:"+t.isAlive());
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
/*
        Thread t1 = new Thread(st);
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new Thread(st);
        t2.setPriority(Thread.NORM_PRIORITY);
        Thread t3 = new Thread(st);
        t3.setPriority(Thread.MAX_PRIORITY);


        t3.start();
        t2.start();*/

    }
}
