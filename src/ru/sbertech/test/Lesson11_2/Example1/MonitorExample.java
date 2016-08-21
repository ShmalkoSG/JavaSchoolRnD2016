package ru.sbertech.test.Lesson11_2.Example1;


/**
 * Created by Student on 18.08.2016.
 */
public class MonitorExample implements Runnable{
    private String message;

    public void doMessage(){
        synchronized (this){
            while(message == null){
                try {
                    wait();
                    System.out.println(message);
                    this.message = null;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void sendMessage(String message){
        synchronized (this){
            this.message = message;
            notify();
        }
    }

    @Override
    public void run() {
        doMessage();
    }
}