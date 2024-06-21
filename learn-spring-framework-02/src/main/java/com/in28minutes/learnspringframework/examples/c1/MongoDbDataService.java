package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

	public int[] retrieveData() {
		return new int[] { 11, 12, 33, 44, 55 };
	}

}
