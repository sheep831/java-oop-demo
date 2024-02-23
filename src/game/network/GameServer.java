package game.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8100);
            for(;;) {
                System.out.println("waiting client...");
                Socket client = server.accept();
                System.out.println("got client:" + client);
                GameServerConnection connection = new GameServerConnection(client);
                new Thread(connection).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Seems port 8100 is already in use");
        }
    }
}
