import game.demo.Animal;
import game.demo.Cat;
import game.core.GameWindow;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Animal animal = new Cat("bubu");
        animal.move();

        GameWindow gameWindow = new GameWindow();
    }
}