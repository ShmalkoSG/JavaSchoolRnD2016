package ru.sbertech.test.Lesson17;

/**
 * Created by Student on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Document d = new Document(new InfoDocExecImpl());

        DocumentExecutor documentExecutor = new DocumentExecutor();

        Account accA = new Account();
        accA.setSaldo(100L);

        Account accB = new Account();
        accB.setSaldo(100L);

        d.setAccA(accA);
        d.setAccB(accB);

        d.setSumma(10L);

        documentExecutor.exec(d);

    }
}