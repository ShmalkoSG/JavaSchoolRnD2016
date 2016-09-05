package ru.sbertech.test.Lesson17;

/**
 * Created by Student on 05.09.2016.
 */
public class DocumentExecuter {
    public  void exec(Document document){
        if(document.getClass().getName()=="ru.sbertech.test.Lesson17.infodoc"){
            System.out.println("This is Info Document");
        }else{

        document.getAccA().setSaldo(document.getAccA().getSaldo()-document.getSumma());

        document.getAccB().setSaldo(document.getAccB().getSaldo()-document.getSumma());

        System.out.println("from account A to B" + document.getSumma());


    }
}}
