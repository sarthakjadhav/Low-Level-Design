package lldPatterns.structural.decorator_plus_factory.wrappers;

import lldPatterns.structural.decorator_plus_factory.UserService;
import lldPatterns.structural.decorator_plus_factory.user_service_decorator.LoggingUserServiceDecorator;

public class LoggingWrapper implements UserServiceWrappers{
    @Override
    public UserService wrap(UserService userService) {
        System.out.println("Looging wrapper created.");
        return new LoggingUserServiceDecorator(userService);
    }
}
