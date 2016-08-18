package ru.sbertech.test.Lesson11_2.Example1;

import java.util.Date;

/**
 * Created by Student on 18.08.2016.
 */
public class Man {
    private final Date date;
    private final String name;

    public Man(String name, Date date) {
        this.name = name;
        this.date = new Date(date.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }


}
