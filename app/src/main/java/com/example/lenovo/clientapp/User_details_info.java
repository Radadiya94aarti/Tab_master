package com.example.lenovo.clientapp;

/**
 * Created by lenovo on 17-03-2017.
 */

public class User_details_info {


    private String username;
    private String emailid;
    private int mobileno;
    private int emergncyno;
    private String text;

    User_details_info(String username,String emailid,int mobileno,int emergncyno,String text) {
        this.username = username;
        this.emailid = emailid;
        this.mobileno = mobileno;
        this.emergncyno = emergncyno;
        this.text = text;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }

    public int getMobileno() {
        return mobileno;
    }

    public void setEmergncyno(int emergncyno) {
        this.emergncyno = emergncyno;
    }

    public int getEmergencyno() {
        return emergncyno;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }



}
