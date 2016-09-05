package ru.sbertech.test.Lesson16.Homework;

public class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        Integer a=new Integer(3);
        Integer b=new Integer(6);
        int i=0;
        while (true) {
            obj = a + b;
           // System.out.println(obj);
           Integer c=new Integer(i);
            i++;
            //Serial GC
            //-XX:+UseSerialGC

            //несколько потоков по сборке young памяти, один поток для сборки old памяти
            //-XX:+UseParallelGC

            //несколько потоков по сборке young и old памяти
            //-XX:+UseParallelOldGC

            //-XX:ParallelGCThreads=<desired number>

            //-XX:+UseConcMarkSweepGC
            //-XX:ParallelCMSThreads=<n>

        }
    }
}
