package Entities;

import Entities.UserData.Hidden.Password;
import Entities.UserData.Hidden.Username;

import java.util.ArrayList;
import java.util.HashMap;

public class UserMap {
    private final ArrayList<User> users;
    private final ArrayList<Password> passwords;
    public HashMap<Username,Password> userMap;

    public UserMap(){
        this.users = new ArrayList<>();
        this.passwords = new ArrayList<>();
        userMap = new HashMap<Username, Password>();
    }

    public UserMap(ArrayList<User> users, ArrayList<Password> passwords){
        this.users = users;
        this.passwords = passwords;
        for (User user : users) {
            Username username = user.getUsername();
            Password password = user.getPassword();
            userMap.put(username, password);
        }
    }

    public void addUser(User user){
        Username username = user.getUsername();
        Password password = user.getPassword();
        if(!userMap.containsKey(username)){
            this.users.add(user);
            this.passwords.add(password);
            userMap.put(username, password);
        }
    }

    public HashMap<Username, Password> getUserMap(){
        return this.userMap;
    }

    public ArrayList<User> getUsers(){
        return this.users;
    }

    public ArrayList<Username> getUsernames(){
        ArrayList<Username> usernames = new ArrayList<>();
        for (User user: this.users){
            usernames.add(user.getUsername());
        }
        return usernames;
    }

    public ArrayList<Password> getPasswords(){
        return this.passwords;
    }

    public boolean userExists(User user){
        for (User otherUser: this.users){
            if (otherUser == user){
                return true;
            }
        }
        return false;
    }





}
