package ru.sbertech.test.Lesson11;

/**
 * Created by svetlanashmalko on 17.08.16.
 */
/**
 * Created by Student on 15.08.2016.
 */
public class Multitreading {
    public static void main(String[] args) {
        SomeTask st = new SomeTask();
        Thread t1 = new Thread(st);
        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2 = new Thread(st);
        t2.setPriority(Thread.NORM_PRIORITY);

        Thread t3 = new Thread(st);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


//        SomeThread st7 = new SomeThread();
//
//        st7.start();
//        System.out.println("end of main prog");

//        new Thread(new Runnable() {
//            public void run() {
//                System.out.println("I'm here now");
//            }
//        }).start();
    }
}