package com.example.loca_sacco.Obj_Classes;

public class LoanType {
    private String typeID;
    private String typeName;

    public LoanType() {
    }//end of empty constructor

    public LoanType(String typeID, String typeName) {
        this.typeID = typeID;
        this.typeName = typeName;
    }//end of constructor

    //setters
    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    //end of setters

    //getters
    public String getTypeID() {
        return typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    //end of getters
}//end of the  class