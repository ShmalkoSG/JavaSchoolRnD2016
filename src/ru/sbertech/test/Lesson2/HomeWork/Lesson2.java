package ru.sbertech.test.Lesson2.HomeWork;

import java.io.*;
import java.util.*;

/**
 * Created by svetlanashmalko on 17.07.16.
 */
public class Lesson2{
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("HomeWork/my_text.txt"));
            String line;
            List<String> my_col = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                my_col.add(line);
            }
            Collections.sort(my_col, new Comparator<String>() {
                public int compare(String o1, String o2) {
                    return o1.toString().compareTo(o2.toString());
                }
            });

            for(int i=0;i<my_col.size();i++) {
                int begin=0;
                int end=0;
                String str=my_col.get(i);
                while (end>=0) {
                    end = str.indexOf(' ');
                    if (end>=0) {
                        str = str.substring(begin, end) + str.substring(end + 1, str.length());
                    }
                }
                my_col.set(i,str);
            }

            System.out.println(my_col.size());
            for(int i=0;i<my_col.size();i++){
                System.out.println(my_col.get(i));
            }
        }
        catch (IOException e)
        {}


    }
}
