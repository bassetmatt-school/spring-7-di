package guru.springframework.spring7di.services.i18n;

import guru.springframework.spring7di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FR")
@Service("i18NService")
public class FrenchGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hon hon, bonjour la baguette et le croissant";
    }
}
