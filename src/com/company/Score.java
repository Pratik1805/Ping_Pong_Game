package com.company;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Score extends Rectangle {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int gameWidth, int gameHeight){
        Score.GAME_WIDTH = gameWidth;
        Score.GAME_HEIGHT = gameHeight;
    }
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.setFont(new Font("Consolas",Font.PLAIN,30));

        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);

        g.drawString("Player1: " + String.valueOf(player1/10)+String.valueOf(player1%10),(GAME_WIDTH/2)-195, 50);
        g.drawString("Player2: " +String.valueOf(player2/10)+String.valueOf(player2%10),(GAME_WIDTH/2)+10, 50);
    }
}
