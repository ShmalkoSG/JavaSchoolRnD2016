package ru.sbertech.test.Lesson3.BeforeGenerics;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
public class Apple {
    final Long id = counter++;

    static Long counter = new Long(0L);

    public Long getId() {
        return id;
    }

    /*public void setId(Long id) {
        this.id = id;
    }*/
}

