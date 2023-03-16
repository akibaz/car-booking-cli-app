package com.akibazcode.user;

public class UserService {

    public static void insertUser(User user) {
        if (user != null) UserDAO.addUser(user);
    }
    public static User[] getUsers() {
        return UserDAO.getUsers();
    }
}
