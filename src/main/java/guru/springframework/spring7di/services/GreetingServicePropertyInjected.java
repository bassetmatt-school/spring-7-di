package guru.springframework.spring7di.services;

import org.springframework.stereotype.Service;

@Service("propertyInjectionService")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends do property injection!!";
    }
}
