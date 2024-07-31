package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel ClockLabel;
    private Font font=new Font("Arial",Font.ITALIC,30);
    MyWindow(){

super.setTitle("MYCLOCK");
super.setLocation(900,150);
super.setSize(500,400);
this.createGUI();
this.startClock();

super.setVisible(true);
    }
    public void createGUI(){
     heading=new JLabel("MyClock");
     ClockLabel=new JLabel("");

     heading.setFont(font);
     ClockLabel.setFont(font);

     this.setLayout(new GridLayout(2,1));
     this.add(heading);
     this.add(ClockLabel);
     ImageIcon image = new ImageIcon("C:\\Users\\surya\\Downloads\\worldmap.png");
        ClockLabel.setIcon(image);


    }
    public void startClock(){
        Timer timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datetime=new Date().toLocaleString();
                ClockLabel.setText(datetime);
            }
        });
        timer.start();
    }

}
