package game.demo;

import game.demo.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + ": climb");
    }
}
