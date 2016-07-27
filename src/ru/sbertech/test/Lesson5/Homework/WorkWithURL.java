package ru.sbertech.test.Lesson5.Homework;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by svetlanashmalko on 27.07.16.
 */
public class WorkWithURL {


    private static String u;

    public static void main(String[] args) {
    while (true) {
    System.out.println("Vvedite URL");
    Scanner in = new Scanner(System.in);
    u = in.next();

    try {
        ReadContent(u);
    } catch (IOException e) {
        e.printStackTrace();
        System.err.println("1");
        continue;
    } catch (URISyntaxException e) {
        e.printStackTrace();
        System.err.println("2");
        continue;
    }
    return;
    }
    }

    private static void ReadContent(String u) throws IOException, URISyntaxException {

            URL url = null;
            url = new URL(u);
            Desktop.getDesktop().browse(url.toURI());



    }

}