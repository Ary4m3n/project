package Entities.UserData.Hidden;

import Entities.UserData.UserData;

public class Password extends UserData<String> {
    public String data;
    public Password(String password){
        super(password);
        this.data = password;
    }
}
