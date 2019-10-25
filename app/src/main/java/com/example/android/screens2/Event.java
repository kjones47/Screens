package com.example.android.screens2;

public class Event {

    int startTime, endTime;
    int month, date, year;
    String title;
    String chair;
    String [] attendees;
    String [] rsvps;
    int points;

    public Event(String t){
        title = t;
    }
    public Event(String t, int m, int d,int y, int p){
        month = m;
        date = d;
        year = y;
        title = t;
        points = p;
    }
  /*  public Event(String title, String chair, int points){

    }*/
    public void setTime(int a,int b){

    }
    public String getTitle(){
    return title;
    }

}
