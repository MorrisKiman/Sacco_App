package com.example.loca_sacco.Obj_Classes;

public class Members {
    private String memberID;
    private String fName;
    private String lName;
    private String idNo;
    private String kontacts;
    private String dob;
    private String doe;
    private String occupation;
    private String residence;
    private String beneficiaryName;
    private String beneficiarySname;
    private String beneficiaryID;
    private String beneficiaryContacts;

    public Members() {

    }//end of empty constructors

    public Members(String memberID, String fName, String lName, String idNo, String kontacts, String dob, String doe, String occupation, String residence, String beneficiaryName, String beneficiarySname, String beneficiaryID, String beneficiaryContacts) {
        this.memberID = memberID;
        this.fName = fName;
        this.lName = lName;
        this.idNo = idNo;
        this.kontacts = kontacts;
        this.dob = dob;
        this.doe = doe;
        this.occupation = occupation;
        this.residence = residence;
        this.beneficiaryName = beneficiaryName;
        this.beneficiarySname = beneficiarySname;
        this.beneficiaryID = beneficiaryID;
        this.beneficiaryContacts = beneficiaryContacts;
    }//end of this constructor


    //all the getters
    public String getMemberID() {
        return memberID;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getIdNo() {
        return idNo;
    }

    public String getKontacts() {
        return kontacts;
    }

    public String getDob() {
        return dob;
    }

    public String getDoe() {
        return doe;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getResidence() {
        return residence;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public String getBeneficiarySname() {
        return beneficiarySname;
    }

    public String getBeneficiaryID() {
        return beneficiaryID;
    }

    public String getBeneficiaryContacts() {
        return beneficiaryContacts;
    }

    //end of the setters

    //start of setters
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public void setKontacts(String kontacts) {
        this.kontacts = kontacts;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public void setBeneficiarySname(String beneficiarySname) {
        this.beneficiarySname = beneficiarySname;
    }

    public void setBeneficiaryID(String beneficiaryID) {
        this.beneficiaryID = beneficiaryID;
    }

    public void setBeneficiaryContacts(String beneficiaryContacts) {
        this.beneficiaryContacts = beneficiaryContacts;
    }
    //end of setters

}//end of class
