package lldPatterns.structural.decorator_plus_factory.wrappers;

import lldPatterns.structural.decorator_plus_factory.UserService;
import lldPatterns.structural.decorator_plus_factory.user_service_decorator.ValidationUserServiceDecorator;

public class ValidationWrapper implements UserServiceWrappers{
    @Override
    public UserService wrap(UserService userService) {
        System.out.println("Validation wrapper created.");
        return new ValidationUserServiceDecorator(userService);
    }
}
