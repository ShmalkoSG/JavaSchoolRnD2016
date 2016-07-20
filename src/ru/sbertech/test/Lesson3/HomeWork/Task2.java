package ru.sbertech.test.Lesson3.HomeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {

        try {//Считываем в файл и построчно записываем в  ArrayList
            BufferedReader reader = new BufferedReader(new FileReader("Text/my_text.txt"));
            String line;
            List<String> my_col = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                my_col.add(line);
            }

            //Считаем количество слов
            List<String> new_col = new ArrayList<String>();
            int kol=0;
            for(int i=0;i<my_col.size();i++) {
                int begin=0;
                int end=0;
                String str=my_col.get(i);
                while (end>=0) {
                    end =str.indexOf(" ",begin);
                    if (end<0){
                        if (str.length()-begin>0) {
                            kol=kol+1;
                            new_col.add(str.substring(begin,str.length()));
                        }
                    }


                    else{
                        if (end-begin>0){
                            kol=kol+1;
                            begin=end+1;
                            new_col.add(str.substring(begin,end));
                        }
                        else begin=end+1;

                    }
                }
            }

            System.out.println(kol);
            for(int i=0;i<my_col.size();i++){
                System.out.println(new_col.get(i));
            }
        }
        catch (IOException e){
            System.out.println("Wrong");
        }



    }
}
