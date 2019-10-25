package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("french")
public class HelloServiceFrenchImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Bonjour Tout le monde";
    }
}
