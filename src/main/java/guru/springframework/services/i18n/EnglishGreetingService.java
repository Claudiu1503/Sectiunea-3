package guru.springframework.services.i18n;

import guru.springframework.services.GreetingSerice;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingSerice {
    @Override
    public String sayGreeting() {
        return "Hello world !!! - EN";
    }
}
