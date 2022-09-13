package com.wappiApp.qa.models;

public class CredentialData {

    private String username;
    private String password;

    public CredentialData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

