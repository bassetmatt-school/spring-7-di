package guru.springframework.spring7di.services.i18n;

import guru.springframework.spring7di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "I quoth hello to thee the world";
    }
}
