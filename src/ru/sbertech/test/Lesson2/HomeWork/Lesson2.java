package ru.sbertech.test.Lesson2.HomeWork;

import ru.sbertech.test.Lesson3.HomeWork.ReadFile;

import java.io.*;
import java.util.*;

/**
 * Created by svetlanashmalko on 17.07.16.
 */
public class Lesson2{
    public static void main(String[] args) throws IOException {
        ReadFile myReadFile =new ReadFile("Text/my_text.txt");
        List <String> myCol=myReadFile.my_col;
           Collections.sort(myCol, new Comparator<String>() {
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });

           for(int i=0;i<myCol.size();i++) {
                int begin=0;
                int end=0;
                String str=myCol.get(i);
                while (end>=0) {
                        end = str.indexOf(' ');
                    if (end>=0) {
                        str = str.substring(begin, end) + str.substring(end + 1, str.length());
                    }
                }
               myCol.set(i,str);
            }

            System.out.println(myCol.size());
            for(int i=0;i<myCol.size();i++){
                System.out.println(myCol.get(i));
            }




    }
}
