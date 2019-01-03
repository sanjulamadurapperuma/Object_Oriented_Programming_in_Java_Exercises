package com.sanjula.oop.java.tutorials.Practice_Paper_1;

public class CinemaScreen {
    private String name;
    private int seatsNum; // from 1 to 100

    public CinemaScreen(){
        this.name = "AMC Loews Lincoln Square";
        this.seatsNum = 1;
    }

    //Method signatures
//    public String getName();
//    public void setString(String name);
//    public int getSeatsNum();
//    public void setSeatsNum(int seatsNum);

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSeatsNum(){
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum){
        if (seatsNum >= 1 && seatsNum <= 250){
            this.seatsNum = seatsNum;
        } else{
            System.out.println("Invalid number of seats");
        }
    }

}
