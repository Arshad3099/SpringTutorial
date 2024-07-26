package com.example.loose.coupling;

public class UserDetails {

    private UserDataProvider userDataProvider;

    public UserDetails(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUser() {
        return userDataProvider.getUserDetails();
    }

}
