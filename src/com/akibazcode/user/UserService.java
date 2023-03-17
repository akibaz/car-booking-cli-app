package com.akibazcode.user;

public class UserService {

    public static void addUser(String name) {
        User user = new User(name);
        UserDAO.addUser(user);
    }
    public static void printUsers() {
        User[] users = UserDAO.getUsers();
        for (User user : users) {
            if (user == null) {
                break;
            } else {
                System.out.println(user);
            }
        }
    }
}
