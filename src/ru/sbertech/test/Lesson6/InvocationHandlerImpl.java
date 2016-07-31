package ru.sbertech.test.Lesson6;

/**
 * Created by svetlanashmalko on 31.07.16.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Student on 28.07.2016.
 */
public class InvocationHandlerImpl implements InvocationHandler {
    private final Object delegate;

    public InvocationHandlerImpl(Object delegate){
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Start " + method.getName());
        Object result = method.invoke(delegate, args);
        System.out.println("Finish " + method.getName() + " result = " + result);

        return result;
    }
}