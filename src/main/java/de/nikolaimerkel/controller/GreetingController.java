package de.nikolaimerkel.controller;

import de.nikolaimerkel.domain.Greeting;
import de.nikolaimerkel.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class GreetingController {

    private GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/")
    public List<Greeting> helloWorld() {
        return greetingService.getAllGreetings();
    }

    @PostConstruct
    public void init() {
        Greeting greeting = new Greeting();
        greeting.setMessage("Hello World!!");
        greetingService.addGreeting(greeting);
    }
}
