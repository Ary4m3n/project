package Entities;

import Entities.UserData.Hidden.Password;
import Entities.UserData.Hidden.Username;
import Entities.UserData.UnHidden.DisplayName;

public class User{

    private final Username username;
    private Password password;
    private DisplayName displayName;

    public User(String username, String password){
        this.username = new Username(username);
        this.password = new Password(password);
        this.displayName = new DisplayName();
    }

    public Username getUsername() {
        return username;
    }

    public Password getPassword() {
        return password;
    }

    public DisplayName getDisplayName() {
        return displayName;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void setDisplayName(DisplayName displayName) {
        this.displayName = displayName;
    }
}
