package guru.springframework.controllers;

import guru.springframework.services.GreetingSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    @Autowired
    private GreetingSerice greetingSerice;



    public void setGreetingSerice(GreetingSerice greetingSerice) {
        this.greetingSerice = greetingSerice;
    }

    public String sayHello(){

         return greetingSerice.sayGreeting();
    }

}
