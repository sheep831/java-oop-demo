package com.desk.java.demo;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameCanvas extends Canvas {
    private List<Shape> shapeList = new ArrayList<Shape>();
    public GameCanvas() {
        this.setSize(300, 300);
        this.setBackground(Color.white);
        Player player = new Player(this);
        addKeyListener(player);
        shapeList.add(player);
    }

    public void addShape(Shape shape) {
        this.shapeList.add(shape);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.clearRect(0,0,getWidth(), getHeight());
        for (Shape shape : shapeList) {
            shape.paint(graphics);
        }
    }


}
