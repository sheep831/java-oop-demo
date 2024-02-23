package game.network;

import java.io.IOException;
import java.net.Socket;

public class GameClient {
    public static void main(String[] args) {
        System.out.println("Connecting to server...");
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 8100);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to server on 127.0.0.1:8100");
        }

    }
}
