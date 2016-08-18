package ru.sbertech.test.Lesson11_2.Example1;

/**
 * Created by Student on 18.08.2016.
 */
public class Test implements Runnable{
    private boolean endFlag=false;
    public void end(){
        setEndFlag(true);
    }

    public synchronized boolean isEndFlag() {
        return endFlag;
    }

    public void setEndFlag(boolean endFlag) {
        this.endFlag = endFlag;
    }


    public synchronized void run(){
        while (!isEndFlag()){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
        }
    }
}
