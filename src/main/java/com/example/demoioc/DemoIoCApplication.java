package com.example.demoioc;


import com.khoa.ioc.IoC;
import com.khoa.ioc.annotation.ComponentScan;

@ComponentScan("com.example.demoioc")
public class DemoIoCApplication {
    public static void main(String[] args) {
        IoC ioC = IoC.initBeans(DemoIoCApplication.class);
        ioC.getBean(Start.class).start();
    }
}
