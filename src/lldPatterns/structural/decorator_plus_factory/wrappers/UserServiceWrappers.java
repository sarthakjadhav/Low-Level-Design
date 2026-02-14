package lldPatterns.structural.decorator_plus_factory.wrappers;

import lldPatterns.structural.decorator_plus_factory.UserService;

public interface UserServiceWrappers {
    UserService wrap(UserService userService);
}
