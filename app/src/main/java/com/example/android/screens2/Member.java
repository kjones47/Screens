package com.example.android.screens2;

public class Member {
    String name, yClass, year, nickname;
    boolean eboard, chair, active, pnm;
    Event [] attended;
    int points;
    Member big;
    Member litte;

    public Member(String n, String c, String y, String s){
        active = true;
        points = 0;
    }

    public void setEboard(){
        eboard = true;
    }
    public void setChair(){
        chair = true;
    }
    public void setActive(){
        active = true;
    }

    public void addPoints(){

    }


}
