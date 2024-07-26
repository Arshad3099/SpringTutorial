package com.example.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider{

    public String getUserDetails() {
        return "User details from database provider";
    }
}
