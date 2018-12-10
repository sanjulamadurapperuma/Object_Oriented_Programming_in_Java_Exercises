package com.sanjula.oop.java.tutorials.week_7;

public class Challenge_1 {
    private boolean uniqueChars(String str){
        //Brute-force technique used
        //If 2 of the same characters are encountered,
        // then return false
        for (int i = 0; i < str.length(); i++){
            for (int j = 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        //If no duplicate characters are found,
        // then return true
        return true;
    }

    public static void main(String[] args) {
        Challenge_1 ch1 = new Challenge_1();
        String str1 = "Excellence";

        if (ch1.uniqueChars(str1)){
            System.out.println("The string " + str1 + " has all unique characters");
        } else{
            System.out.println("The string " + str1 + " has duplicate characters");
        }

    }
}
