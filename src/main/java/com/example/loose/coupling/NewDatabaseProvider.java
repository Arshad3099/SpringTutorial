package com.example.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider {

    public String getUserDetails() {
        return "User details from new database";
    }

}
