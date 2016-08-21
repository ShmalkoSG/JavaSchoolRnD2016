package ru.sbertech.test.Lesson11_2.Example1;

/**
 * Created by Student on 18.08.2016.
 */
public class Main {
    public static void main(String[] args) {
//        Account account = new Account(100);
//        int x = 3;
//        for (int i = 0; i < x; i++) {
//            new Thread(account).start();
//        }



//        Square square = new Square(2,3,4);
//        Thread t1 = new Thread(square);
//        Thread t2 = new Thread(square);
//
//        t1.start();
//        t2.start();



//        Test t = new Test();
//        Thread t1 = new Thread(t);
//        t1.start();
//
//        try {
//            Thread.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t.end();
//        System.out.println("End of main!");

//        Date dat1 = new Date();
//
//        Man ivan = new Man("Ivan", dat1);
//        System.out.println(ivan.getDate());
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        dat1.setTime(new Date().getTime());
//        System.out.println(ivan.getDate());


//        Test t = new Test();
//
//        Thread tr = new Thread(t);
//        tr.start();
//        tr.interrupt();

        MonitorExample monitorExample = new MonitorExample();

        Thread tr = new Thread(monitorExample);
        tr.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        monitorExample.sendMessage("Hello!!!");

    }
}
