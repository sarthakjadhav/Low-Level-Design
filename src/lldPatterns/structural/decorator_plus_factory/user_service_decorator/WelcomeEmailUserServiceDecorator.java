package lldPatterns.structural.decorator_plus_factory.user_service_decorator;

import lldPatterns.structural.decorator_plus_factory.UserService;

public class WelcomeEmailUserServiceDecorator extends UserServiceDecorator{
    public WelcomeEmailUserServiceDecorator(UserService userService) {
        super(userService);
    }

    @Override
    public void createUser(String name) {
        userService.createUser(name);
        System.out.println("Mail: \nHello "+name+ "\nWelcome to the family.\nThanks,\nOrg");
    }
}
