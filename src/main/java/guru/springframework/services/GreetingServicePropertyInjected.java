package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingSerice{


    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection";
    }
}
