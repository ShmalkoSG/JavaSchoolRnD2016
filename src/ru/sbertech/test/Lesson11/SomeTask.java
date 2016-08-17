package ru.sbertech.test.Lesson11;

/**
 * Created by svetlanashmalko on 17.08.16.
 */
/**
 * Created by Student on 15.08.2016.
 */
public class SomeTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 0; i< 5; i++) {
            System.out.println("st:" + Thread.currentThread().getName() + "(" + i + ")");
        }
    }

    public static void main(String[] args) {
        SomeTask st = new SomeTask();

        Thread t = new Thread(st);

        t.start();
        System.out.println("1: " + t.isAlive());

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2: " + t.isAlive());
        /*for (int i = 0; i< 4; i++) {
            new Thread(st).start();
        }*/

        System.out.println("End of main programm");
    }
}