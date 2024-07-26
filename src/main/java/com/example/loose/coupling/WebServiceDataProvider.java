package com.example.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "User details from Web service provider";
    }

}
