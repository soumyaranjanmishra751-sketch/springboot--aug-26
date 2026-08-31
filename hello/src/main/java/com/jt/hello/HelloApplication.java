package com.jt.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.Teacher;
@ImportResource("beans.xml")
@SpringBootApplication
@ComponentScan(basePackages = {"com"})

public class HelloApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(HelloApplication.class, args);
		//1.using xml file======
		greet Greet = context.getBean(greet.class);
        Greet.sayhello();

		//2.using stereotype annotation=======
		person person = context.getBean(person.class);
		person.sayhello();	

		//3.using configuration file======
		student student = context.getBean(student.class);
		student.sayhello();

		Teacher teacher = context.getBean(Teacher.class);
		teacher.sayhello();

		System.out.println(teacher.hashCode());
		Teacher teacher1 = context.getBean(Teacher.class);
		System.out.println(teacher1.hashCode());

		System.out.println("Student1" + student.hashCode());
		student student2 = context.getBean(student.class);
		System.out.println("Student1" + student2.hashCode());

	}

}
