package Entities;

import Entities.UserData.UserData;

public class CurrentUser {
    private static UserData<String> currentUser;
    private static boolean loggedIn;

    public void setCurrentUser(UserData<String> currentUsername){
        currentUser = currentUsername;
    }

    public UserData<String> getUser(){
        return currentUser;
    }

    public void logout(){
        loggedIn = false;
    }

    public void login(){
        loggedIn = true;
    }
}
