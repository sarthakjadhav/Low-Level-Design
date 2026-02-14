package lldPatterns.structural.facade.user_registrationfloweg;

public class Facade {
    private UserService service;

    public Facade(String fName, String lName){
        this.service = new ProfileService(fName,lName);
    }

    public void register(){
        service.createUser();
        ((ProfileService)service).createProfile();
        ((ProfileService)service).showDetails();
    }
}
