package lldPatterns.structural.facade.user_registrationfloweg;

public class UserService {
    String fName;
    String lName;

    public UserService(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public void createUser(){
        System.out.println("\n...Profile created for "+this.fName+" "+this.lName+"...");
    }

}
