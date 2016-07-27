package ru.sbertech.test.Lesson5;
class MyException extends RuntimeException{

}

class MyExceptionTest{
    public static void main(String[] args) {
        throw new MyException();
    }

}