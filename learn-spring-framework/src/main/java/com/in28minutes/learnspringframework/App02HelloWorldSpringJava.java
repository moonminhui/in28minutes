package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpringJava {

	public static void main(String[] args) {
		// 1 : Launch a Spring Context
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2 : Configure the things that we want Spring to manage - @Configuration (Spring 프레임워크가 관리하도록 설정) 


	}

}
