package com.example.loca_sacco.Obj_Classes;

public class AccName {

    private String accountName;
    private String nameID;//pk

    public AccName() {
    }//end of empty constructor

    public AccName(String accountName, String nameID) {
        this.accountName = accountName;
        this.nameID = nameID;
    }//full constructor

    //setters

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setNameID(String nameID) {
        this.nameID = nameID;
    }

    //end of setters

    //getters

    public String getAccountName() {
        return accountName;
    }

    public String getNameID() {
        return nameID;
    }

    //end of getters
}
