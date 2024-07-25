package com.loose.coupling;

public class UserDetails {

    public UserDataProvider userDataProvider;

    public UserDetails(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUser() {
        return userDataProvider.getUserDetails();
    }
}
