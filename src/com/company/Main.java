package com.company;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        Welcome w = new Welcome();
        w.setBounds(460,250,1000,(int) (1000 * (0.5555)));
        w.setVisible(true);
//        w.setBackground(Color.black);
        w.setResizable(false);


    }
}
