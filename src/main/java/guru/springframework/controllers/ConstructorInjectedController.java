package guru.springframework.controllers;

import com.sun.jdi.event.StepEvent;
import guru.springframework.services.GreetingSerice;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingSerice greetingSerice;

    public ConstructorInjectedController(@Qualifier("greetingSericeImpl") GreetingSerice greetingSerice) {
        this.greetingSerice = greetingSerice;
    }


    public String sayHello(){
        return greetingSerice.sayGreeting();
    }
}
