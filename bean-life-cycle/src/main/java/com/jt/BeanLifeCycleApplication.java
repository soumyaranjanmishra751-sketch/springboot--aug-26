package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanLifeCycleApplication {

	public static void main(String[] args) {
	var context =	SpringApplication.run(BeanLifeCycleApplication.class, args);
	
	}
/*
bean life cycle 
1. bean Instantiated - constructor
2. Dependency Injected (if available) - by usingnany way of DI
3.bean initialized -@postConstruct
4. Bean used
5. Bean Destroyed - @preDestroy
*/
}
