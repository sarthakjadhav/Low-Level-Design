package lldPatterns.structural.decorator_plus_factory.user_service_decorator;

import lldPatterns.structural.decorator_plus_factory.UserService;

public class ValidationUserServiceDecorator extends UserServiceDecorator{
    public ValidationUserServiceDecorator(UserService userService) {
        super(userService);
    }

    @Override
    public void createUser(String name) {
        if(name == null || name.isEmpty()){
            throw new RuntimeException("...invalid user name...");
        }
        System.out.println("Validation successful...");
        userService.createUser(name);
    }
}
