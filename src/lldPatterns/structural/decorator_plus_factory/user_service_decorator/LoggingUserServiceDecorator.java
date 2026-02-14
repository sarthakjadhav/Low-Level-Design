package lldPatterns.structural.decorator_plus_factory.user_service_decorator;

import lldPatterns.structural.decorator_plus_factory.UserService;

public class LoggingUserServiceDecorator extends UserServiceDecorator{

    public LoggingUserServiceDecorator(UserService userService) {
        super(userService);
    }

    @Override
    public void createUser(String name) {
        userService.createUser(name);
        System.out.println("Logging user "+name);
    }
}
