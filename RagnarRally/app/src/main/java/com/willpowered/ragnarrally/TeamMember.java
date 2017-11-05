package com.willpowered.ragnarrally;

/**
 * Created by Admin on 11/4/2017.
 */

public class TeamMember {

    private String username;
    private String phoneNumber;

    public TeamMember(){

    }

    public TeamMember(String user, String phone)
    {
        username=user;
        phoneNumber = phone;
    }

    public String getUser(){
        return username;
    }

    public String getPhone(){
        return phoneNumber;
    }

}
