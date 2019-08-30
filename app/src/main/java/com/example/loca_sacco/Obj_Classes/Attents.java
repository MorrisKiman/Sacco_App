package com.example.loca_sacco.Obj_Classes;

public class Attents {
    private String attendantID;
    private String attendantFname;
    private String attendantLname;
    private String attendantPass;
    private String kontacts;


    public Attents() {
    }//end of empty constructor

    public Attents(String attendantID, String attendantFname, String attendantLname, String attendantPass, String kontacts) {
        this.attendantID = attendantID;
        this.attendantFname = attendantFname;
        this.attendantLname = attendantLname;
        this.attendantPass = attendantPass;
        this.kontacts = kontacts;
    }//end of constructor


    //the getters
    public String getAttendantID() {
        return attendantID;
    }

    public String getAttendantFname() {
        return attendantFname;
    }

    public String getAttendantLname() {
        return attendantLname;
    }

    public String getAttendantPass() {
        return attendantPass;
    }

    public String getKontacts() {
        return kontacts;
    }
    //end of the getters

    //the setters
    public void setAttendantID(String attendantID) {
        this.attendantID = attendantID;
    }

    public void setAttendantFname(String attendantFname) {
        this.attendantFname = attendantFname;
    }

    public void setAttendantLname(String attendantLname) {
        this.attendantLname = attendantLname;
    }

    public void setAttendantPass(String attendantPass) {
        this.attendantPass = attendantPass;
    }

    public void setKontacts(String kontacts) {
        this.kontacts = kontacts;
    }
    //end of setters

}//end of the class
