package com.example.demoioc.service;

import com.khoa.ioc.annotation.Component;

@Component
public class ToolService {
    public String getTool() {
        return "Tool!";
    }
}
