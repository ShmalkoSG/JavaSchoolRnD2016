package ru.sbertech.test.Lesson3.HomeWork;

import java.util.Comparator;

/**
 * Created by svetlanashmalko on 20.07.16.
 */
public class SlovoLengthComporator implements Comparator<Slovo> {
    @Override
    public int compare(Slovo o1, Slovo o2) {
        if(o1.getWordLength()> o2.getWordLength())
            return 1;
        else if(o1.getWordLength()< o2.getWordLength())
            return -1;
        else
            return 0;
    }
}
