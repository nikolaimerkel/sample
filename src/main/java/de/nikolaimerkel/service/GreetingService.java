package de.nikolaimerkel.service;

import de.nikolaimerkel.domain.Greeting;
import de.nikolaimerkel.repository.GreetingRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component("greetingService")
@Transactional
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;

    }

   public Greeting addGreeting(final Greeting greeting) {
        return greetingRepository.save(greeting);
   }

   public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
   }
}