package Java2.lessons.lesson6.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public Server() {

        ServerSocket server = null;
        Socket socket = null;
        BufferedReader reader;

        PrintWriter writer;
        try {
            server = new ServerSocket(8080);
            System.out.println("Сервер запущен");

            socket = server.accept();
            System.out.println("Клиент подключён");

            Scanner sc2 = new Scanner(System.in);
            writer = new PrintWriter(socket.getOutputStream(), true);
            InputStreamReader in = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(in);

            new Thread(new Runnable() {
                @Override
                public void run() {

                    while (true) {

                        String str2 = sc2.nextLine();
                        writer.println(str2);
                    }
                }
            }).start();

            try {
                if (socket.isConnected()) {
                    while (true) {
                        String str = reader.readLine();
                        if (str.equalsIgnoreCase("/end")) break;
                        System.out.println("Клиент: " + str);
                    }
                }
            } catch(Exception e){
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void Disconnect() {

    }


}