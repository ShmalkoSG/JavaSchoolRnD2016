package ru.sbertech.test.Lesson5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Student on 25.07.2016.
 */
public class AnotherFinallyTest {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\1.txt");
            out = new FileOutputStream("C:\\2.txt");
            out.write(in.read());
        } catch(IOException e){
            System.out.println("File not found");

        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                //NOP
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                //NOP
            }
        }
    }
}
