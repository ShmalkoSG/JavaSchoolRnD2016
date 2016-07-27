package ru.sbertech.test.Lesson5;

import java.io.IOException;

class Parent {
    /**
     *
     * @throws IOException
     */
    public void method() throws IOException{

    }
}

class Child extends Parent {
    @Override
    public void method() throws IOException{

    }

    public void test (Parent a) throws IOException{
        a.method();
    }

    public static void main(String[] args) throws IOException {
        Child ch = new Child();
        Parent a = new Parent();
        ch.test(a);
        ch.test(ch);
    }
   /* public static void main(String[] args) {
        try {
            f();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void f() throws IOException {
        g();
    }
    private static void g() throws IOException {
        FileInputStream in = new FileInputStream("1.txt");
        in.close();
    }*/
}
