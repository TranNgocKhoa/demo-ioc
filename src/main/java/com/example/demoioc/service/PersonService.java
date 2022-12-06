package com.example.demoioc.service;

import com.khoa.ioc.annotation.Component;

@Component
public class PersonService {
    private final ToolService toolService;

    public PersonService(ToolService toolService) {
        this.toolService = toolService;
    }

    public void work() {
        System.out.println(toolService.getTool());

        System.out.println("Work!");
    }
}
