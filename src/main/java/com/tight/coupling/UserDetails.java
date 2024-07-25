package com.tight.coupling;

public class UserDetails {

    public UserDatabaseProvider userDatabaseProvider = new UserDatabaseProvider();

    public String getUser() {
        return userDatabaseProvider.getUserDetails();
    }

}
