package com;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Teacher {
    public void sayhello(){
        System.out.println("Teacher say hello");
    }
}
