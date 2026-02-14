package lldPatterns.structural.decorator_plus_factory.wrappers;

import lldPatterns.structural.decorator_plus_factory.UserService;
import lldPatterns.structural.decorator_plus_factory.user_service_decorator.RetryUserServiceDecorator;

public class RetryWrapper implements UserServiceWrappers{

    @Override
    public UserService wrap(UserService userService) {
        System.out.println("Retry wrapper created.");
        return new RetryUserServiceDecorator(userService);
    }
}
