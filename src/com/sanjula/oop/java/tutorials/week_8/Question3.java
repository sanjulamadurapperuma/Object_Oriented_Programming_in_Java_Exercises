package com.sanjula.oop.java.tutorials.week_8;

import javax.swing.*;

public class Question3 extends JFrame{
    JLabel lblImage;

    ImageIcon imageIconOne;

    public Question3(){
        //create a label with a default image
        try{
            imageIconOne = new ImageIcon(getClass().getResource("one.png"));

        } catch (NullPointerException e){
            System.out.println("Image one not found");
        }

        lblImage = new JLabel(imageIconOne, JLabel.CENTER);
    }

    public static void main(String[] args) {
        //Invoke the constructor by allocating an anonymous instance
        Question3 myFrame = new Question3();

    }
}
