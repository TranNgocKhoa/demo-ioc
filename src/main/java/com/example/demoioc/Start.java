package com.example.demoioc;

import com.example.demoioc.service.PersonService;
import com.khoa.ioc.annotation.Component;

@Component
public class Start {
    private final PersonService personService;

    public Start(PersonService personService) {
        this.personService = personService;
    }

    public void start() {
        System.out.println("======= Start =======");
        personService.work();
        System.out.println("=======  End  =======");
    }
}
