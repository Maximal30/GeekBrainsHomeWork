package Java2.lessons.lesson7;

import Java2.lessons.lesson7.server.MServer;
import com.sun.security.ntlm.Client;
import javafx.application.Application;

public class Runner {
    public static void main(String[] args) {
        new Thread(() -> new MServer()).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        new Thread(() -> Application.launch(Client.class, args)).start();
    }
}
