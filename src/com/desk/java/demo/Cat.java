package com.desk.java.demo;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + ": climb");
    }
}
