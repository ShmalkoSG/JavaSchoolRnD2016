package ru.sbertech.test.Lesson9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Student on 08.08.2016.
 */
public class Student implements Serializable{

    private String group;
    private int avgMark;

    public Student(){
        group="default";
        avgMark=3;

    }

    /*public static void main(String[] args) {
        Student student= new Student();
        String fileName="c:/student.bin";
        try (FileOutputStream fis=new FileOutputStream(fileName);
        ObjectOutputStream oos=new ObjectOutputStream(fis)){
            oos.writeObjext(student);
     }*/
    //}
}
