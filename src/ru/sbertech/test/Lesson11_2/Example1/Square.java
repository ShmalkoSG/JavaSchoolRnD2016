package ru.sbertech.test.Lesson11_2.Example1;

/**
 * Created by svetlanashmalko on 21.08.16.
 */
public class Square implements Runnable{

    private Object lockWidth = new Object();
    private Object lockLocation = new Object();

    private int width;
    private int x;
    private int y;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        synchronized (lockWidth) {
            this.width = width;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void changeLocation(int x, int y){

        System.out.println("start changing");
        synchronized (lockLocation) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.x = x;
            this.y = y;
        }
        System.out.println("Changed!!!");
    }

    public Square(int width, int x, int y) {
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        changeLocation(2,3);
    }
}