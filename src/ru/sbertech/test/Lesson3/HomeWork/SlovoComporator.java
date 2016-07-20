package ru.sbertech.test.Lesson3.HomeWork;

import java.util.Comparator;

/**
 * Created by svetlanashmalko on 20.07.16.
 */
public class SlovoComporator implements Comparator<Slovo> {
    @Override
    public int compare(Slovo o1, Slovo o2) {

            return o1.getWord().compareTo(o2.getWord());
        }
    }

