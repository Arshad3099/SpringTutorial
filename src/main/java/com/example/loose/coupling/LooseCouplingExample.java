package com.example.loose.coupling;

public class LooseCouplingExample {

    public static void main(String[] args) {

        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserDetails userDetails = new UserDetails(userDataProvider);
        System.out.println(userDetails.getUser());

        UserDataProvider newUserDataProvider = new NewDatabaseProvider();
        UserDetails newUserDB = new UserDetails(newUserDataProvider);
        System.out.println(newUserDB.getUser());

        UserDataProvider webServiceUserProvide = new WebServiceDataProvider();
        UserDetails webUserDetails = new UserDetails(webServiceUserProvide);
        System.out.println(webUserDetails.getUser());

    }
}
