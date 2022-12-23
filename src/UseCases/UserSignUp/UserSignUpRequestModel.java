package UseCases.UserSignUp;

public class UserSignUpRequestModel {
    private final String name;
    private final String password;
    private final String repeatPassword;

    public UserSignUpRequestModel(String name, String password, String repeatPassword){
        this.name = name;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    // Getters

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public String getRepeatPassword(){
        return this.repeatPassword;
    }
}
