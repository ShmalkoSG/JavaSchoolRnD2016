package ru.sbertech.test.Lesson15.Third;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * Created by Student on 29.08.2016.
 */
public class ServerUDP {
    public static final int PORT = 3333;
    public static final String HOST = "localhost";
    public static final int BUFFER_SIZE = 256;

    public static void main(String[] args) throws IOException {
        try (/*DatagramSocket socket = new DatagramSocket(PORT)*/
             MulticastSocket socket = new MulticastSocket(PORT)){
            InetAddress multicastAddress = InetAddress.getByName("224.0.0.22");
            socket.joinGroup(multicastAddress);
            byte[] buffer = new byte[BUFFER_SIZE];
            String command = "";
            do {
                DatagramPacket datagram = new DatagramPacket(buffer, buffer.length);
                socket.receive(datagram);
                command = new String(datagram.getData(),0,datagram.getLength());
                System.out.print(command);
            } while (!command.equals("exit"));
        }
    }
}