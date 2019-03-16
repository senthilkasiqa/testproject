package com.test.learning;

public class User {

    String userName;
    String password;

    public static void main(String args[]) {
        User user = new User();
        user.User("senthil", "password");
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
