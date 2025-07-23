package com.simpleci.simpleci;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {



    @GetMapping("/hello")
    public  String sayHello()
    {
           return "Hello form docker spring boot appliction";
    }


}
