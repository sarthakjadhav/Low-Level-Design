package lldPatterns.structural.facade.user_registrationfloweg;

public class ProfileService extends UserService{
    String mail;

    public ProfileService(String fName, String lName) {
        super(fName, lName);
    }

    public void createProfile(){
        this.mail = this.fName+"."+this.lName +"@lld.com";
    }

    public void showDetails(){
        System.out.println("\nPrinting details of user|");
        System.out.println("Name: "+ this.fName.toLowerCase() + " "+ this.lName.toLowerCase());
        System.out.println("Mail ID: "+mail);
    }
}
