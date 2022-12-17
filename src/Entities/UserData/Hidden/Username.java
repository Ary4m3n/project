package Entities.UserData.Hidden;

import Entities.UserData.UserData;

import java.io.Serializable;

public class Username extends UserData<String> implements Serializable {
    public String data;

    public Username(String username){
        super(username);
        this.data = username;
    }
}
