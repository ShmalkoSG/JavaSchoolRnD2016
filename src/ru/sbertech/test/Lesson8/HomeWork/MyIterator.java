package ru.sbertech.test.Lesson8.HomeWork;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator {
    public static <T> Iterator<T> getIterator(final T[] array) {
        return new Iterator<T>() {
            private int count = array.length;
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (index < count) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

            //для теста пусть будет тоже самое, что и next()
            public T prevEl() {
                if (index < count) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove item from array.");
            }
        };
    }

}

