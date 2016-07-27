package ru.sbertech.test.Lesson5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Student on 25.07.2016.
 */
public class AnotherFinallyTestTryWithResources {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("C:\\1.txt");
             FileOutputStream out = new FileOutputStream("C:\\2.txt");
        ) {
            out.write(in.read());
        } catch(IOException e){
            System.out.println("Something goes wrong");
        }
    }
}
