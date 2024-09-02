package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class GreetingServicePrimary implements GreetingSerice{

    @Override
    public String sayGreeting() {
        return "Hello From Primary Been (Greeting Service)";
    }
}
