package com.akibazcode.user;

class UserDAO {
    private static User[] users;
    private static int nextAvailableIndex = 0;
    private static final int CAPACITY = 100;
    static {
        users = new User[CAPACITY];
    }

    public static void addUser(User user) {
        users[nextAvailableIndex++] = user;
    }

    public static User[] getUsers() {
        return users;
    }
}
