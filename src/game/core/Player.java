package game.core;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Shape implements KeyListener {
    GameCanvas canvas;
    Vector speed = new Vector();
    int x = 0;
    int y = 0;
    int size = 10;
    public Player(GameCanvas canvas) {
        super(10, Color.red);
        this.canvas = canvas;
    }
    void updatePosition() {
        position.x += speed.x;
        position.y += speed.y;
        canvas.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        updatePosition();
        char keyChar = e.getKeyChar();
        if (keyChar == ' ') {
            dropItem();
        }
    }

    void dropItem() {
        Bomb bomb = new Bomb();
//        bomb.position = this.position.clone();
        bomb.position.x = this.position.x;
        bomb.position.y = this.position.y;
        canvas.addShape(bomb);
        canvas.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w':
                speed.y = -5;
                break;
            case 's':
                speed.y = 5;
                break;
            case 'a':
                speed.x = -5;
                break;
            case 'd':
                speed.x = 5;
                break;
        }
        updatePosition();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w':
            case 's':
                speed.y = 0;
                break;
            case 'a':
            case 'd':
                speed.x = 0;
                break;
        }
        updatePosition();
    }
}
