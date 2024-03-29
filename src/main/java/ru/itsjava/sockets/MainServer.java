package ru.itsjava.sockets;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class MainServer {

    @SneakyThrows
    public static void main(String[] args) {

        // Instantiating ServerSocket on defined port:
        ServerSocket serverSocket = new ServerSocket(8081);
        Boolean exitFlag = false; // to exit infinite loops;

        while (true) {
            // Accepting a connection to serverSocket and creating socket connection to client
            Socket socket = serverSocket.accept();
            if (socket.isConnected()) {
                System.out.println("Client connected!");

                // This is an instance of socket input stream. We can read it with readLine() method
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                String msgFromClient;
                while ((msgFromClient = bufferedReader.readLine()) != null) { // loop through received msgs from client.
                    System.out.println(msgFromClient);

                    if (msgFromClient.equals("exit")) // out of this loop msgFromClient will be null
                        exitFlag = true;
                }

            }
            if (exitFlag) break;
        }
    }
}
