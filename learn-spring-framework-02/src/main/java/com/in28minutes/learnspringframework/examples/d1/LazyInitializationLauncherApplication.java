package com.in28minutes.learnspringframework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// 1. Bean을 생성하고 있는 ClassA
@Component
class ClassA {
	
}

// 2. ClassA Bean을 사용하여 초기화하는 ClassB
@Component
@Lazy // ClassB Bean을 사용할 때서야 초기화됨
class ClassB { // ClassA를 사용할 다른 컴포넌트

	// 의존성 정의
	private ClassA classA;

	// 초기화 로직 - 모든 자동 작업
	public ClassB(ClassA classA) {

		// Logic
		System.out.println("Some Initialization logic"); // *Bean을 로드하지 않고, Bean에서 메서드를 호출하지 않더라도 자동으로 Bean이 초기화 됨 -> 그렇게 되지 않기 위해서 '@Lazy'
		this.classA = classA; // 생성자 사용
	}
	
	public void doSomething() {
		System.out.println("Do Something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
				(LazyInitializationLauncherApplication.class)) {
			
			System.out.println("Initialization of context is completed");
			
			context.getBean(ClassB.class).doSomething();
			
		}

	}

}
