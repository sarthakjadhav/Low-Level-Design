package lldPatterns.structural.decorator_plus_factory.user_service_decorator;

import lldPatterns.structural.decorator_plus_factory.UserService;

public abstract class UserServiceDecorator implements UserService {
    protected UserService userService;

    public UserServiceDecorator(UserService userService){
        this.userService=userService;
    }
}
