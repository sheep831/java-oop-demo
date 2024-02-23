import com.desk.java.demo.Animal;
import com.desk.java.demo.Cat;
import com.desk.java.demo.GameWindow;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Animal animal = new Cat("bubu");
        animal.move();

        GameWindow gameWindow = new GameWindow();
    }
}