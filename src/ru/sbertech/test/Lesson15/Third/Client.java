package ru.sbertech.test.Lesson15.Third;

/**
 * Created by svetlanashmalko on 31.08.16.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Created by Student on 29.08.2016.
 */
public class Client {
    public static final int PORT = 8080;
    public static final String HOST = "localhost";

    public static void main(String[] args) throws IOException {
        //InetAddress address = InetAddress.getByName(HOST);
        InetAddress group = InetAddress.getByName("ff02::1");
     //   InetAddress group = InetAddress.getByName("224.0.0.22");
        try (
                DatagramSocket socket = new DatagramSocket();
                BufferedReader console = new BufferedReader(new InputStreamReader(System.in))
        )
        {
            String line;
            do {
                System.out.print("Enter message: ");
                line = console.readLine();
                byte[] bytes = line.getBytes();
                //DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,PORT);
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length,group,PORT);
                socket.send(dp);
            } while (!line.equals("exit"));
        }
    }
}