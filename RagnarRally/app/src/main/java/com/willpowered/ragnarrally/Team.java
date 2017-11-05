package com.willpowered.ragnarrally;


import java.util.List;

/**
 * Created by Admin on 11/4/2017.
 */

public class Team {
    private String team_name;
    private List<TeamMember> members;

    public Team(String name){
        team_name = name;
    }

    public String getName(){
        return team_name;
    }

    public List<TeamMember> getMembers(){
        return members;
    }




}
