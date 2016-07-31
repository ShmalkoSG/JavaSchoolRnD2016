package ru.sbertech.test.Lesson6;

/**
 * Created by svetlanashmalko on 31.07.16.
 */
public class C extends B implements I{
    @ValidLength(5)
    private String str = "first";
    public B bC;

    public C(){
    }

    @Override
    public void someMethod(String param){
        System.out.println(str + ' ' + param);
    }
}