package ru.sbertech.test.Lesson19.Observer;

import java.io.PrintWriter;

/**
 * Created by Student on 12.09.2016.
 */
public class Client {
    public static void main(String[] args) {

    }
}
interface Observable{
    void notifyObserver();
    void addObserver(Observer o);

}

interface  Observer{
    void onChange(int temperature,int pressure);
}
class MeteoStation implements Observable{
    int temperature;
    int pressure;

    void setData(int temperature,int pressure){
        this.temperature=temperature;
        this.pressure=pressure;
    }

    @Override
    public void notifyObserver(Observer observer) {
        for (Observer observer)
    }

    @Override
    public void addObserver(Observer o) {

    }
}

class ConsoleObserver implements Observer{

    @Override
    public void onChange(int temperature, int pressure) {
        for (Observer observer)
            System.out.println(temperature,pressure);
    }
}

class FileObserver implements Observer{

    @Override
    public void onChange(int temperature, int pressure) {
        try (PrintWriter writer )
    }
}