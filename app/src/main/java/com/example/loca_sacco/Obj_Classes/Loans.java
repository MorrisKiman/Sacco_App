package com.example.loca_sacco.Obj_Classes;

public class Loans {
    private String loanID;
    private String loan_Type;
    private String loanReason;
    private String loanAmount;
    private String load_StartD;
    private String load_EndD;
    private String memberID;
    private String tellerID;
    private String payable;
    private String paid;
    private String status;

    public Loans() {
    }//end of empty constructor

    public Loans(String loanID, String loan_Type, String loanReason, String loanAmount, String load_StartD, String load_EndD, String memberID, String tellerID, String payable, String paid, String status) {
        this.loanID = loanID;
        this.loan_Type = loan_Type;
        this.loanReason = loanReason;
        this.loanAmount = loanAmount;
        this.load_StartD = load_StartD;
        this.load_EndD = load_EndD;
        this.memberID = memberID;
        this.tellerID = tellerID;
        this.payable = payable;
        this.paid = paid;
        this.status = status;
    }

    //setters
    public void setLoanID(String loanID) {
        this.loanID = loanID;
    }

    public void setLoan_Type(String loan_Type) {
        this.loan_Type = loan_Type;
    }

    public void setLoanReason(String loanReason) {
        this.loanReason = loanReason;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setLoad_StartD(String load_StartD) {
        this.load_StartD = load_StartD;
    }

    public void setLoad_EndD(String load_EndD) {
        this.load_EndD = load_EndD;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setTellerID(String tellerID) {
        this.tellerID = tellerID;
    }

    public void setPayable(String payable) {
        this.payable = payable;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    //end of setters

    //gettters
    public String getLoanID() {
        return loanID;
    }

    public String getLoan_Type() {
        return loan_Type;
    }

    public String getLoanReason() {
        return loanReason;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public String getLoad_StartD() {
        return load_StartD;
    }

    public String getLoad_EndD() {
        return load_EndD;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getTellerID() {
        return tellerID;
    }

    public String getPayable() {
        return payable;
    }

    public String getPaid() {
        return paid;
    }

    public String getStatus() {
        return status;
    }

    //end of gettters
}//end of the
