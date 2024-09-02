package guru.springframework.controllers;

import guru.springframework.services.GreetingSerice;
import guru.springframework.services.GreetingSericeImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    private final GreetingSerice greetingSerice;


    //???

    public MyController() {
        this.greetingSerice = new GreetingSericeImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingSerice.sayGreeting();
    }
}