package com.desk.java.demo;

import java.awt.*;

public class Shape {
    public Vector position = new Vector();
    public int size;
    public Color color;

    public Shape(int size, Color color) {
        this.size = size;
        this.color = color;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(position.x,position.y,size,size);
    }
}
