package ru.sbertech.test.Lesson5;

public class FinallyTest {
    public static void main(String[] args) {
        //System.out.println(f());
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try{
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("I'm thread");
                }
            }
        }).start();

        int a = 4/0;
    }

    private static int f() {
        /*try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }*/
        try {
            throw new Exception();
        } finally {
            return 3;
        }
    }
}

