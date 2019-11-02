package com.example.mvp_practice1.Model;

public class User {
    private String mFirstName;
    private String mLastName;
    private String mAddress;
    private String mAge;

    public User() {
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmAge() {
        return mAge;
    }

    public void setmAge(String mAge) {
        this.mAge = mAge;
    }
    public String getDetails(){
        return "Hi " + getmFirstName() + " " + getmLastName() + "\n" +
                "You're from " + getmAddress() + "\n" +
                "You're " + getmAge() + " year's old,";
    }
}
