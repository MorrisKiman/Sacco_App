package com.example.loca_sacco.Obj_Classes;

public class Tellrs {
    private String tellerID;
    private String teller_Fname;
    private String teller_Sname;
    private String tellerPass;
    private String kontacts;

    public Tellrs() {
    }//end of constructor

    public Tellrs(String tellerID, String teller_Fname, String teller_Sname, String tellerPass, String kontacts) {
        this.tellerID = tellerID;
        this.teller_Fname = teller_Fname;
        this.teller_Sname = teller_Sname;
        this.tellerPass = tellerPass;
        this.kontacts = kontacts;
    }//end of the constructor

    //setters

    public void setTellerID(String tellerID) {
        this.tellerID = tellerID;
    }

    public void setTeller_Fname(String teller_Fname) {
        this.teller_Fname = teller_Fname;
    }

    public void setTeller_Sname(String teller_Sname) {
        this.teller_Sname = teller_Sname;
    }

    public void setTellerPass(String tellerPass) {
        this.tellerPass = tellerPass;
    }

    public void setKontacts(String kontacts) {
        this.kontacts = kontacts;
    }

    //end of setters

    //getters

    public String getTellerID() {
        return tellerID;
    }

    public String getTeller_Fname() {
        return teller_Fname;
    }

    public String getTeller_Sname() {
        return teller_Sname;
    }

    public String getTellerPass() {
        return tellerPass;
    }

    public String getKontacts() {
        return kontacts;
    }

    //end of setters

}//end of class