package com.codepath.example.customadapterdemo;

import java.util.ArrayList;

public class User {
    public String name;
    public String hometown;

    public User(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Harry", "San Diego"));
        users.add(new User("Marla", "San Francisco"));
        users.add(new User("Sarah", "San Marco"));
        users.add(new User("Francisco", "Irvine"));

        users.add(new User("cindy", "San Diego"));
        users.add(new User("erika", "San Francisco"));
        users.add(new User("crystal", "San Marco"));
        users.add(new User("esperanza", "Irvine"));

        users.add(new User("vale", "San Diego"));
        users.add(new User("lido", "San Francisco"));
        users.add(new User("maria", "San Marco"));
        users.add(new User("brenda", "Irvine"));

        users.add(new User("tom", "San Diego"));
        users.add(new User("dani", "San Francisco"));
        users.add(new User("celia", "San Marco"));
        users.add(new User("james", "Irvine"));
        return users;
    }
}
