package ru.sbertech.test.Lesson15;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Random;

/**
 * Created by Student on 29.08.2016.
 */
public class Worker implements Runnable {
    public Worker(Socket socket) {
        this.socket = socket;
    }

    private Socket socket;

    @Override
    public void run() {
        InputStream inputStream=null;
        int secretNumber=new Random().nextInt(9);
        System.out.println("Zagadali "+ secretNumber);
      try{
          inputStream=socket.getInputStream();
        OutputStream outputStream=socket.getOutputStream();

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader((inputStream)));

        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("Guess number");
        bufferedWriter.write("\n");
        bufferedWriter.flush();

          String answer;
          while (true){
             if((answer= bufferedReader.readLine()) !=null);
              if (secretNumber==Integer.parseInt(answer)){
                  bufferedWriter.write("Write");
                  bufferedWriter.write("\n");
                  bufferedWriter.flush();
                  break;
              } else {
                  System.out.println( "Wrong");
              }
          }
        inputStream.close();
        outputStream.close();
        socket.close();}
      catch (IOException e){
          e.printStackTrace();
      }
    }
}
