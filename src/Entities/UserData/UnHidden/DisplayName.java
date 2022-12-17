package Entities.UserData.UnHidden;

import Entities.UserData.UserData;

import java.io.Serializable;

public class DisplayName extends UserData<String> implements Serializable {
    public String data;

    public DisplayName(String displayName){
        super(displayName);
        this.data = displayName;
    }
    public DisplayName(){
        super("Enter Display Name");
        this.data = "Enter Display Name";
    }
}
