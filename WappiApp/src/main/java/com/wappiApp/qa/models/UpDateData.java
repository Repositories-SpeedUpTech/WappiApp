package com.wappiApp.qa.models;


public class UpDateData {

    private String name;
    private String lastname;
    private String date;

    public UpDateData(String name, String lastname, String date) {

        this.name = name;
        this.lastname = lastname;
        this.date = date;
    }
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDate() {
        return date;
    }

}

