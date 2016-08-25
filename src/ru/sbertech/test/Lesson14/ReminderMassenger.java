package ru.sbertech.test.Lesson14;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Student on 25.08.2016.
 */
public class ReminderMassenger {


    public static void main(String[] args) {
       ScheduledExecutorService service= Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(new Reminder(),0,5, TimeUnit.SECONDS);
      service.shutdown();

    }
}
