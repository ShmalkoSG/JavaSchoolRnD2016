package ru.sbertech.test.Lesson15.First;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Student on 29.08.2016.
 */
public class MyServer {
    public static final int DEFAULT_PORT = 3333;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(DEFAULT_PORT);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        while (true) {
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            OutputStream outputStream = accept.getOutputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String s = bufferedReader.readLine();
            System.out.println(s);

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write((new Date().toString()));
            bufferedWriter.write("\n");
            bufferedWriter.flush();

            inputStream.close();
            outputStream.close();
            accept.close();
        }
    }
}