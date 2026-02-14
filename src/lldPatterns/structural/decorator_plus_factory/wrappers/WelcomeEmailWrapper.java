package lldPatterns.structural.decorator_plus_factory.wrappers;

import lldPatterns.structural.decorator_plus_factory.UserService;
import lldPatterns.structural.decorator_plus_factory.user_service_decorator.WelcomeEmailUserServiceDecorator;

public class WelcomeEmailWrapper implements UserServiceWrappers{
    @Override
    public UserService wrap(UserService userService) {
        System.out.println("Welcome email wrapper created.");
        return new WelcomeEmailUserServiceDecorator(userService);
    }
}
