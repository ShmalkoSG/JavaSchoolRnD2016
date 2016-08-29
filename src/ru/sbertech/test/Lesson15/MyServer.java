package ru.sbertech.test.Lesson15;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * Created by Student on 29.08.2016.
 */
public class MyServer {
    public static final int DEFAULT_PORT=3333;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(DEFAULT_PORT);
        Socket accept=serverSocket.accept();
        InputStream inputStream=accept.getInputStream();
        OutputStream outputStream=accept.getOutputStream();

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader((inputStream)));
        String s =bufferedReader.readLine();
        System.out.println(s);
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("Ok");
        bufferedWriter.write("\n");
        bufferedWriter.flush();

    }
}
