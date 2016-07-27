package ru.sbertech.test.Lesson5;

/**
 * Created by Student on 25.07.2016.
 */
class MySuperAutoCloseableClass implements AutoCloseable {

    @Override
    public void close() throws Exception{
        System.out.println("All resources released");
    }
}


class AutoCloseableTest {
    public static void main(String[] args) {
        try (MySuperAutoCloseableClass instance = new MySuperAutoCloseableClass()) {
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("Something goes wrong");
        }
    }
}