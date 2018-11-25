package com.sanjula.oop.java.tutorials.Week_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShowImageFrame extends JFrame {
    JButton btnOne;
    JButton btnTwo;
    JLabel lblImage;

    ImageIcon imageIconZero;
    ImageIcon imageIconOne;
    ImageIcon imageIconTwo;

    public ShowImageFrame(){
        Container cp = getContentPane();
        //set layout in the main panel
        cp.setLayout(new BorderLayout());
        cp.setBackground(Color.blue);

        //create a panel with two buttons in a grid
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 2));
        //create and add buttons
        btnOne = new JButton("One");
        p1.add(btnOne);

        btnTwo= new JButton("Two");
        p1.add(btnTwo);

        //create a label with a default image
        imageIconZero = new ImageIcon(getClass().getResource("zero.png"));
        lblImage = new JLabel(imageIconZero, JLabel.CENTER);

        //add the jlabel on the top
        cp.add(lblImage, BorderLayout.CENTER);

        //add the button on the bottom
        cp.add(p1, BorderLayout.SOUTH);

        //instantiate the other two images
        imageIconOne = new ImageIcon(getClass().getResource("one.png"));
        imageIconTwo = new ImageIcon(getClass().getResource("two.png"));

        //add event handler
        MyListener myListener = new MyListener();
        btnOne.addActionListener(myListener);
        btnTwo.addActionListener(myListener);

        //add mouse listener to the jLabel
        lblImage.addMouseListener(myListener);
    }

    private class MyListener extends MouseAdapter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent evt) {
            String btnLabel = evt.getActionCommand();

            //event.getActionCommand() returns the button's label
            if (btnLabel.equals("One")){
                lblImage.setIcon(imageIconOne);
            } else if (btnLabel.equals("Two")){
                lblImage.setIcon(imageIconTwo);
            }
        }

        public void mouseClicked(MouseEvent evt){
            lblImage.setIcon(imageIconZero);
        }
    }
}


