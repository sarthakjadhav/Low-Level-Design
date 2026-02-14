package lldPatterns.structural.decorator_plus_factory;

import lldPatterns.structural.decorator_plus_factory.factory.UserServiceFactory;
import lldPatterns.structural.decorator_plus_factory.wrappers.LoggingWrapper;
import lldPatterns.structural.decorator_plus_factory.wrappers.RetryWrapper;
import lldPatterns.structural.decorator_plus_factory.wrappers.ValidationWrapper;
import lldPatterns.structural.decorator_plus_factory.wrappers.WelcomeEmailWrapper;

import java.util.Arrays;

public class AppConfig {
    public static UserService userService(){
        return UserServiceFactory.create(
                Arrays.asList(new ValidationWrapper(),
                new LoggingWrapper(),
                new RetryWrapper(),
                new WelcomeEmailWrapper())
        );
    }
}
