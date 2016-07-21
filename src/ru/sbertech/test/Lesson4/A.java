package ru.sbertech.test.Lesson4;

/**
 * Created by Student on 21.07.2016.
 */
public class A<T> {
    T param1;
public A(T param){
    this.param1=param;
}

    public A() {

    }

    public void setParam1(T param1) {
        this.param1 = param1;
    }

    public T getParam1() {

        return param1;
    }
    public String getType(){
        return param1.getClass().getTypeName();
    }
}
