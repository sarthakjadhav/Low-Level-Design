package lldPatterns.structural.decorator_plus_factory.user_service_decorator;

import lldPatterns.structural.decorator_plus_factory.UserService;

public class RetryUserServiceDecorator extends UserServiceDecorator{
    public RetryUserServiceDecorator(UserService userService) {
        super(userService);
    }

    @Override
    public void createUser(String name) {
        int attempts = 3;
        for(int i=0;i<attempts;i++){
            try{
                userService.createUser(name);
                return;
            } catch (Exception e) {
                System.out.println("Retrying attempt "+i+1);
                if(i==attempts) throw e;
            }
        }
    }
}
