package ru.sbertech.test.Lesson3.HomeWork;

import java.io.IOException;
import java.util.List;

/**
 * Created by svetlanashmalko on 20.07.16.
 */
public class Task4 {
        public static void main(String[] args) throws IOException {

            ReadFile myReadFile =new ReadFile("Text/my_text.txt");
            List <String> myCol=myReadFile.my_col;

            for(int i=myCol.size();i>0;i--){
                System.out.println(myCol.get(i-1));
            }
        }

    }
