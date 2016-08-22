package ru.sbertech.test.Lesson11_2.Example1;

/**
 * Created by Student on 18.08.2016.
 */
public class Sqare implements Runnable {



    private Object lockWidth=new Object();
    private Object locLocation=new Object();

    public Sqare(int width, int x, int y) {
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        synchronized (lockWidth){
        this.width = width;}
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

 public void changeLocation(int x,int y){
     System.out.println("start");
     synchronized (locLocation){
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         this.x=x;
     this.y=y;}
         System.out.println("changed");
 }

    private int width;
    private int x;
    private int y;


    @Override
    public void run() {
        changeLocation(2,3);
    }
}
