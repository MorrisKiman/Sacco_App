package com.example.loca_sacco.Obj_Classes;

public class Boss {
    private String userName;
    private String fname;
    private String password;

    public Boss() {
    }//end of empty constructor

    public Boss(String userName, String fname, String password) {
        this.userName = userName;
        this.fname = fname;
        this.password = password;
    }//end of constructor

    //setters

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //end of setters

    //getters

    public String getUserName() {
        return userName;
    }

    public String getFname() {
        return fname;
    }

    public String getPassword() {
        return password;
    }

    //end of getters
}//end of class