package com.company;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Paddle extends Rectangle{
    int id;
    int yVelocity;   //How fast paddle is moving up and down
    int speed = 20;
    Paddle(int x,int y,int paddleWidth, int paddleHeight, int id){
        super(x,y,paddleWidth,paddleHeight);
        this.id = id;

    }
    public void keyPressed(KeyEvent e){
        switch (id){
            case 1:
                if(e.getKeyCode() == KeyEvent.VK_W){
                    //VK_W --> keyboard key W
                    setYDirection(-speed);
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_S){
                    //VK_W --> keyboard key S
                    setYDirection(speed);
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    //VK_W --> keyboard key upperArrow
                    setYDirection(-speed);
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    //VK_W --> keyboard key DownArrow
                    setYDirection(speed);
                    move();
                }
                break;
        }
    }
    public void keyReleased(KeyEvent e){
        switch (id){
            case 1:
                if(e.getKeyCode() == KeyEvent.VK_W){
                    //VK_W --> keyboard key W
                    setYDirection(0);
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_S){
                    //VK_W --> keyboard key W
                    setYDirection(0);
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    //VK_W --> keyboard key W
                    setYDirection(0);
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    //VK_W --> keyboard key W
                    setYDirection(0);
                    move();
                }
                break;
        }

    }
    public void setYDirection( int yDirection){
        yVelocity = yDirection;
    }
    public void move(){
        y = y + yVelocity;
    }
    public void draw(Graphics g){
        if (id == 1){
            g.setColor(Color.red);
        }
        else {
            g.setColor(Color.GREEN);
        }
        g.fillRect(x,y,width,height);
    }
}
