package com.in28minutes.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
	
	// '필드 주입'을 사용한 자동 와이어링
	Dependency1 dependency1;
	
	Dependency2 dependency2;

	// Generate Constructor using Fields - '생성자 주입'을 사용한 자동 와이어링
	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	// Generate Setter and Getter - '수정자 주입'을 사용한 자동 와이어링
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection - setDependency1");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - setDependency2");
//		this.dependency2 = dependency2;
//	}
	

	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}

}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}

@Configuration
@ComponentScan
public class DeplnjectionLauncherApplication {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
				(DeplnjectionLauncherApplication.class)) {
			
			// Spring 컨텍스트에서 어떤 Bean이 쓰였는지 확인하는 방법
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

			System.out.println(context.getBean(YourBusinessClass.class));
			
		}

	}

}
