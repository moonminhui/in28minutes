package com.in28minutes.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {
	
	public static void main(String[] args) {
		try (var context = 
				new AnnotationConfigApplicationContext
				(RealWorldSpringContextLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			// BusinessCalculationService를 얻고 이에 대한 메소드를 실행
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}

}