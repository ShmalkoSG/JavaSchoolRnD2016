package ru.sbertech.test.Lesson14;

import java.util.concurrent.Callable;

/**
 * Created by Student on 25.08.2016.
 */
public class MyCollable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return String.valueOf(Thread.currentThread().getId());
    }
}
