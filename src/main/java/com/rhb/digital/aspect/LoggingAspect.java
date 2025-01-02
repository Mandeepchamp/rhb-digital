package com.rhb.digital.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.controller.*.*(..))")
    public void logRequest() {
        System.out.println("Request logged by AspectJ");
    }
}

