package ru.sbertech.test.Lesson16.Homework;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by svetlanashmalko on 04.09.16.
 */
public class FillMap {
    long start = System.currentTimeMillis();
    public Map<Integer,String> map = new HashMap<>();
    public static void main(String[] args) {
        new FillMap();
        Date time=new Date(System.currentTimeMillis());

    }

      FillMap() {
          for(int i=0;i<100_000;i++){
              map.put(i,"value "+i);

        }
         //System.out.println(map);
          //-XX:+PrintCompilation -XX:+UnlockDiagnosticVMOptions -XX:+PrintInlining 

          long finish = System.currentTimeMillis();
          System.out.println("Время выполенения кода " +(finish - start));


      }
}



