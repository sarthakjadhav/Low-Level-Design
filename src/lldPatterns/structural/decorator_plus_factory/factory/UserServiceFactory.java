package lldPatterns.structural.decorator_plus_factory.factory;

import lldPatterns.structural.decorator_plus_factory.BasicUserService;
import lldPatterns.structural.decorator_plus_factory.UserService;
import lldPatterns.structural.decorator_plus_factory.user_service_decorator.UserServiceDecorator;
import lldPatterns.structural.decorator_plus_factory.wrappers.UserServiceWrappers;

import java.util.List;

public class UserServiceFactory {
    public static UserService create(List<UserServiceWrappers> wrappers){
        for(UserServiceWrappers wrappers1:wrappers){
            System.out.println(wrappers1);
        }
        UserService service = new BasicUserService();
        for(UserServiceWrappers wrapper:wrappers){
            service = wrapper.wrap(service);
        }
        return service;
    }
}
