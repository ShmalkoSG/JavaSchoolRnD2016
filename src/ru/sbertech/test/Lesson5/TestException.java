package ru.sbertech.test.Lesson5;

public class TestException {
    public static void main(String[] args) {
        a();
    }

    private static void a(){
        b();
    }

    private static void b(){
        c();
    }

    private static void c(){
        int x = 1;
        int y = 0;
        System.out.println(x/y);
    }
}