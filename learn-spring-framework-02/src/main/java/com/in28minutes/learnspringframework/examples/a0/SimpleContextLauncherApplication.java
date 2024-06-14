package com.in28minutes.learnspringframework.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
				(SimpleContextLauncherApplication.class)) {
			
			// Spring 컨텍스트에서 어떤 Bean이 쓰였는지 확인하는 방법
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

			
		}

	}

}
