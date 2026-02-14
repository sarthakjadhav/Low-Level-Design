package lldPatterns.structural.decorator_plus_factory;

public class BasicUserService implements UserService{

    @Override
    public void createUser(String name) {
        System.out.println("User "+name+" saved to DB.");
    }
}
