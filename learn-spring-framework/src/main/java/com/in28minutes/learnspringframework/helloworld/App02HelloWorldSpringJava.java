package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpringJava {

	public static void main(String[] args) {
		
		// 1 : Launch a Spring Context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			
			// 2 : Configure the things that we want Spring to manage - @Configuration (Spring 프레임워크가 관리하도록 설정) 
			// HelloWorldConfiguration - @Configuration
			// name - @Bean
			
			// 3 : Retrieving Beans managed by Spring (Spring이 관리하는 Bean을 검색)
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean(Address.class)); // 유형도 매개변수로 사용 가능
			
			System.out.println(context.getBean("person5Qualifier"));
			
			System.out.println("==============================");
			
			// context.getBeanDefinitionNames() 
			// -> 관리되는 모든 Bean의 이름을 반환
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
		
	}

}
