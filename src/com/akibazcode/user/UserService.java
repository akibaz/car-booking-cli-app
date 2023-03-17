package com.akibazcode.user;

public class UserService {

    public static void addUser(String name) {
        User user = new User(name);
        UserDAO.addUser(user);
    }
    public static User[] getUsers() {
        return UserDAO.getUsers();
    }
}
