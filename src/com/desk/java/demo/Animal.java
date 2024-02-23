package com.desk.java.demo;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void move() {
        System.out.println(this.name + " is moving");
    }
}
