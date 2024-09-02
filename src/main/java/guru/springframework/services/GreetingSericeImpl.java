package guru.springframework.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingSericeImpl implements GreetingSerice {
    @Override
    public String sayGreeting() {
        return "Hello la toata lumea din Base Service !!! ";
    }
}
