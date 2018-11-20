package com.sanjula.oop.java.tutorials.week_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    private JLabel lblCount; //Declare component JLabel
    private JTextField tfCount; //Declare component JTextField
    private JButton btnCount; //Declare component JButton
    private int count = 0; // counter's value

    private JButton btnCountDown;
    private JButton btnReset;

    //Constructor to setup UI components and event handlers
    public Counter(){
        //sets layout to FlowLayout, which arranges
        // Components from left-to-right, then top to bottom
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.setBackground(Color.lightGray);

        lblCount = new JLabel("Counter"); //Construct component Label
        add(lblCount);                         //"super" Frame adds Label

        tfCount = new JTextField(count + " ", 10); //Construct component TextField
        tfCount.setEditable(false); //read-only
        add(tfCount); //"super" Frame adds TextField

        btnCount = new JButton("Count Up"); //Construct component Button
        add(btnCount); //"super" Frame adds Button
        btnCount.setBackground(Color.cyan);

        btnCountDown = new JButton("Count down");
        add(btnCountDown);
        btnCountDown.setBackground(Color.yellow);

        btnReset = new JButton("Reset");
        add(btnReset);
        btnReset.setBackground(Color.pink);

        MyListener handler = new MyListener();
        btnCount.addActionListener(handler);
        btnCountDown.addActionListener(handler);
        btnReset.addActionListener(handler);

        this.setTitle("Counter");
        this.setSize(500, 100);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class MyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent evt) {


            String btnLabel = evt.getActionCommand();
            // event.getActionCommand() returns the button's label
            if (btnLabel.equals("Count Up")){
                ++count;
                tfCount.setText(count + "");
            } else if(btnLabel.equals("Count down")){
                --count;
                tfCount.setText(count + "");
            } else if(btnLabel.equals("Reset")){
                count = 0;
                tfCount.setText(count + "");
            }
        }
    }


    public static void main(String[] args) {
        Counter counterFrame = new Counter();
    }
}
