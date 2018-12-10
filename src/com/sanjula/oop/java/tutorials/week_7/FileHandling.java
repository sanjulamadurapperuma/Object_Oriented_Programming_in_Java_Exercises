package com.sanjula.oop.java.tutorials.week_7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            //Show the menu
            System.out.println("\nMenu");
            System.out.println("1 - Add Student in the List and save to file");
            System.out.println("2 - Read Students List from a file and display on the screen");
            System.out.println("3 - Exit");
            System.out.print("Enter your choice : ");
            //get the choice and store as char
            char choice = sc.nextLine().charAt(0);

            switch(choice){
                case '1':
                    String exit = "";
                    System.out.println("\nAdd Student in the List and save to file \n");
                    do {
                        System.out.print("Student Name      : ");
                        String name = sc.nextLine();
                        System.out.print("Student ID Number : ");
                        int id = sc.nextInt();
                        System.out.print("Student Mark      : ");
                        double mark = sc.nextDouble();
                        sc.nextLine();
                        //PrintWriter here
                        PrintWriter out = new PrintWriter(new
                                FileWriter("file.txt",true),
                                true);
                        //The output buffer is flushed whenever a byte array is written
                        //Use print writer to perform actions
                        out.println(id);
                        out.println(name);
                        out.println(mark);
                        out.flush();
                        out.close();
                        System.out.println();
                        System.out.print("Enter 1 to continue and zero to exit : ");
                        exit = sc.nextLine();
                    }while (!exit.equals("0"));
                    break;
                case '2':
                    System.out.println("\nRead Students List " +
                            "from a file and display on the screen \n");
                    Scanner file = new Scanner(new File("file.txt"));
                    //While the file has next print the integer, string and double
                    while (file.hasNext()) {
                        System.out.println(file.nextInt());
                        System.out.println(file.next());
                        System.out.println(file.nextDouble());

                        file.nextLine();
                    }
                    break;
                case '3':
                    System.out.println("\n Exit \n");
                    System.exit(0);
                    //Program is stopped
                    break;
                default:
                    System.out.println("\nInvalid choice \n");
                    break;
            }
        }
    }

}
