package game.core;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class QuitButton extends Button implements MouseListener {
    GameWindow gameWindow;
    public QuitButton(GameWindow gameWindow) {
        super("quit");
        this.gameWindow = gameWindow;
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked quit button");
        gameWindow.setVisible(false);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
