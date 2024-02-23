package com.desk.java.demo;

import java.awt.*;

public class GameWindow extends Frame {
    public GameWindow() {
        this.setLayout(null);
        this.setSize(400, 400);

        Button quitButton = new QuitButton(this);
        quitButton.setBounds(8,8,50,50);

        GameCanvas canvas = new GameCanvas();
        canvas.setBounds(50,75,300,300);

        this.add(quitButton);
        this.add(canvas);

        this.setVisible(true);
    }
}
