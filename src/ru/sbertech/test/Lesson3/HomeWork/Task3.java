package ru.sbertech.test.Lesson3.HomeWork;

import java.io.IOException;
import java.util.*;

/**
 * Created by svetlanashmalko on 20.07.16.
 */
public class Task3 { public static void main(String[] args) throws IOException {

    ReadFile myReadFile =new ReadFile("Text/my_text.txt");
    List<String> myCol=myReadFile.my_col;

    Map new_col = new HashMap<String,Integer>();
    
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
                        if (new_col.containsKey(slovo)){
                            int count = (int)new_col.get(slovo) +1;
                            new_col.put(slovo,count);
                        }
                        else new_col.put(slovo,1);
                    }
                }
                else{
                    if (end-begin>0){
                        kol=kol+1;
                        String slovo=str.substring(begin,end);
                        if (new_col.containsKey(slovo)==true){
                            int count = (int)new_col.get(slovo) +1;
                            new_col.put(slovo,count);
                        }
                        else new_col.put(slovo,1);
                        begin=end+1;
                    }
                    else begin=end+1;

                }
            }
        
        
    }
    
   
       
   


    Iterator it=new_col.entrySet().iterator();
    while (it.hasNext()){
        System.out.println( it.next().toString());
    }




}
}
