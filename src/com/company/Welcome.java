package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame {
    JButton btn1;
    JLabel l1;

    Welcome(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.black);

        l1 = new JLabel("Welcome to Table Tennis Game");
        l1.setBounds(150,50,1000,100);
        l1.setFont(new Font("Consolas",Font.PLAIN,40));
        l1.setForeground(Color.WHITE);
        add(l1);

        btn1 = new JButton("Start");
        btn1.setBounds(400,200,100,50);
        btn1.setFont(new Font("Consolas",Font.PLAIN,20));
        btn1.setBackground(Color.GREEN);
        btn1.setFocusable(false);
        add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameFrame frame = new GameFrame();
            }
        });



    }
}
