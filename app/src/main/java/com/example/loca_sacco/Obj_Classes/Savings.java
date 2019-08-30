package com.example.loca_sacco.Obj_Classes;

public class Savings {
    private String accountID;
    private String accountName;
    private String account_Value;
    private String memberID;
    private String date_created;
    private String date_Deposited;

    public Savings() {
    }//end of the constructor

    public Savings(String accountID, String accountName, String account_Value, String memberID, String date_created, String date_Deposited) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.account_Value = account_Value;
        this.memberID = memberID;
        this.date_created = date_created;
        this.date_Deposited = date_Deposited;
    }//end of the constructor

    //setters

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccount_Value(String account_Value) {
        this.account_Value = account_Value;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public void setDate_Deposited(String date_Deposited) {
        this.date_Deposited = date_Deposited;
    }

    //end of setters

    //getters

    public String getAccountID() {
        return accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccount_Value() {
        return account_Value;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getDate_created() {
        return date_created;
    }

    public String getDate_Deposited() {
        return date_Deposited;
    }

    //end of getters

}//end of class