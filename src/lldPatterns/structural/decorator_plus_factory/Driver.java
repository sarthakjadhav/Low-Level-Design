package lldPatterns.structural.decorator_plus_factory;

public class Driver {
    public static void main(String[] args){
        UserService userService = AppConfig.userService();

        userService.createUser("Sarthak");
    }
}
