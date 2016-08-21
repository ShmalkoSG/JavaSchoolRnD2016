package ru.sbertech.test.lesson11_2.example1;

/**
 * Created by Student on 18.08.2016.
 */
public class Account implements Runnable{

    private final Object myLock = new Object();

    private int saldo;

    public void decreaseSaldo(int sum){
        System.out.println("Try decrease saldo");

        synchronized (myLock) {
            if (saldo - sum < 0) {
                System.out.println("Overdraft not avialable");
            } else {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                saldo = saldo - sum;
            }
        }
    }

    public Account(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void run() {
        int x=12;
        for (int i = 0; i < x; i++) {
            decreaseSaldo(10);

            if (getSaldo() < 0){
                throw new RuntimeException("current account overdraft");
            }
        }
    }
}