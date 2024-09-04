package guru.springframework.services.i18n;

import guru.springframework.services.GreetingSerice;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingSerice {

    @Override
    public String sayGreeting() {
        return "Holla todos - ES";
    }
}
