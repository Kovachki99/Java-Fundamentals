package com.company;

import java.util.*;

public class Team {
    String name;
    String creator;
    public List<String> users = new ArrayList<>();

    public Team(String name, String creator) {
        this.creator = creator;
        this.name = name;
    }
    public void usersAdd(String name){
        this.users.add(name);
    }

    public int count(){
        return this.users.size();
    }

    public String getName() {
        return name;
    }

}
