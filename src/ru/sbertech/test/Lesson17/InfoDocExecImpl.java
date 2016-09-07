package ru.sbertech.test.Lesson17;

/**
 * Created by svetlanashmalko on 07.09.16.
 */
public class InfoDocExecImpl implements ExecBehavior {
    @Override
    public void exec(Document document) {
        System.out.println("This is Info Document");
    }
}