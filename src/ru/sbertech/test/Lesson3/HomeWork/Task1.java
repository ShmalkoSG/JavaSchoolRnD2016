package ru.sbertech.test.Lesson3.HomeWork;

import java.io.IOException;
import java.util.List;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {

        ReadFile myReadFile =new ReadFile("Text/my_text.txt");
        List <String> myCol=myReadFile.my_col;
          //Считаем количество слов
            int kol=0;
            for(int i=0;i<myCol.size();i++) {
                int begin=0;
                int end=0;
                String str=myCol.get(i);
                while (end>=0) {
                    end =str.indexOf(" ",begin);
                    if (end<0){
                        if (str.length()-begin>0) kol=kol+1;
                        }


                    else{
                    if (end-begin>0){
                        kol=kol+1;
                        begin=end+1;
                    }
                        else begin=end+1;

                    }
                }
            }

            System.out.println(kol);
            for(int i=0;i<myCol.size();i++){
                System.out.println(myCol.get(i));
            }
        }

}





