package com.in30mins.restful_webservices.section;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping(path = "/HelloWorld")
    public String helloWorld(){
        return "Hello World...";
    }

    @RequestMapping(path = "/HelloWorldBean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World...");
    }
    @RequestMapping(path = "/HelloWorld/{name}")
    public HelloWorldBean helloWorldBeanPath(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello , %s",name));
    }
}
