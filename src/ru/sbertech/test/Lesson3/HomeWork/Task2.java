package ru.sbertech.test.Lesson3.HomeWork;

import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {

        ReadFile myReadFile =new ReadFile("Text/my_text.txt");
        List <String> myCol=myReadFile.my_col;

        Comparator<Slovo> pcomp = new SlovoLengthComporator().thenComparing(new SlovoComporator());
        TreeSet<Slovo> new_col = new TreeSet(pcomp);


            //Считаем количество слов


            int kol=0;
            for(int i=0;i<myCol.size();i++) {
                int begin=0;
                int end=0;
                String str=myCol.get(i);
                while (end>=0) {
                    end =str.indexOf(" ",begin);
                    if (end<0){
                        if (str.length()-begin>0) {
                            kol=kol+1;
                            String slovo=str.substring(begin,str.length());
                            Slovo tmpSlovo=new Slovo(slovo,slovo.length());
                            new_col.add(tmpSlovo);
                        }
                    }
                    else{
                        if (end-begin>0){
                            kol=kol+1;
                            String slovo=str.substring(begin,end);
                            Slovo tmpSlovo=new Slovo(slovo,slovo.length());
                            new_col.add(tmpSlovo);
                            begin=end+1;
                        }
                        else begin=end+1;

                    }
                }
            }


        Iterator it=new_col.iterator();
        while (it.hasNext()){
            System.out.println(((Slovo) it.next()).word);
        }




    }
}
