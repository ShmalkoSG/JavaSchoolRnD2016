package ru.sbertech.test.Lesson14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Student on 25.08.2016.
 */
public class TaskTest {
    public static void main(String[] args) {

        Runnable task =new Task();
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.submit(task);
        executorService.shutdown();
        }
    }

