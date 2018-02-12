package com.example.aryam.tripsplit;

import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

/**
 * Created by aryam on 2/12/2018.
 */

public class Group {
    private String name;
    private String description;
    private ArrayList<Child> userArrayList;

    public Group(String name,String description,ArrayList<Child> userArrayList) {
        this.userArrayList = userArrayList;
        this.name =name;
        this.description =description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Child> getUserArrayList() {
        return userArrayList;
    }

    public void setUserArrayList(ArrayList<Child> userArrayList) {
        this.userArrayList = userArrayList;
    }
}


