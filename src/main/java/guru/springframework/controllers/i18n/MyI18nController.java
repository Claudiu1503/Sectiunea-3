package guru.springframework.controllers.i18n;

import guru.springframework.services.GreetingSerice;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18nController {

    private final GreetingSerice greetingSerice;

    public MyI18nController(@Qualifier("i18NService") GreetingSerice greetingSerice) {
        this.greetingSerice = greetingSerice;
    }

    public String sayHello(){
        return greetingSerice.sayGreeting();
    }

}
