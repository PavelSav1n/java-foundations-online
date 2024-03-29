package ru.itsjava.sockets;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MainClient {

    @SneakyThrows
    public static void main(String[] args) {

        // Instantiating Socket instantly tries to connect to defined server:
        Socket socket = new Socket("localhost", 8081);

        if (socket.isConnected()) {

            System.out.println("Connected to server!");

            // Trying to send a message to server:
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream()); // PrintWriter to send string messages to socket output stream
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader is for receiving string from console input
            while (true) { // To constantly read from console:
                String msgFromConsole = bufferedReader.readLine(); // Reads the line from console.
                printWriter.println(msgFromConsole); // Sending string to socket output stream.
//                printWriter.flush(); // Well flush is needed to instantly flush msg from client.

                if (msgFromConsole.equals("flush"))
                    printWriter.flush();
                if (msgFromConsole.equals("exit")) // just to exit loop
                {
                    printWriter.flush();
                    socket.close();
                    break;
                }
            }
        }
    }
}
