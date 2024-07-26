package com.example.tight.coupling;

public class UserDetails {

    UserDatabaseProvider userDatabaseProvider = new UserDatabaseProvider();
//    WebServiceDataProvider userDatabaseProvider = new WebServiceDataProvider();

    public String getUser() {
        return userDatabaseProvider.getUserDetails();
    }

}
