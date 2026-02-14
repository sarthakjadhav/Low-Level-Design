package lldPatterns.structural.facade.user_registrationfloweg;

import java.util.Scanner;

public class Client {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String fname = sc.next();
        System.out.print("Enter last name: ");
        String lname = sc.next();
        Facade app = new Facade(fname,lname);
        app.register();
    }
}
