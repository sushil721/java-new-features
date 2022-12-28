package com.javanew.features;

import java.util.List;

public class JNF01LambdaExpression {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		// numbers.stream().forEach(System.out::println);
		
		//=> Lambda Expression:-
		//   ------------------
		// Use Filter: Find Even numbers from this list of numbers
		//numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		// Use Filter: Find Even numbers from this list of numbers
		//numbers.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
		
		// Use Filter: Find Strings which contains "Spring" from the list of courses.
		//courses.stream().filter(str -> str.contains("Spring")).forEach(System.out::println);
		
		// Use Filter: Find Strings which size is more than 4 from the list of courses.
		courses.stream().filter(str -> str.length() > 4 ).forEach(System.out::println);
	}

}
