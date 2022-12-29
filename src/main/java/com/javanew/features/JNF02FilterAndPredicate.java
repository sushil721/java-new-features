package com.javanew.features;

import java.util.List;
import java.util.function.Predicate;

public class JNF02FilterAndPredicate {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		//=> Filter :-
		//   -------
		// Use Filter: Find Even numbers from this list of numbers
		//numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		// Use Filter: Find Even numbers from this list of numbers
		//numbers.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
		
		// Use Filter: Find Strings which contains "Spring" from the list of courses.
		//courses.stream().filter(str -> str.contains("Spring")).forEach(System.out::println);
		
		// Use Filter: Find Strings which size is more than 4 from the list of courses.
		//courses.stream().filter(str -> str.length() > 4 ).forEach(System.out::println);
		
		//=> Predicate :-
		//   ------------
		// Use Predicate Interface in filter() : Find Strings which size is more than 4 from the list of courses.
		
		//courses.stream().filter(str -> str.length() > 4 ).forEach(System.out::println);
		// Select 'str -> str.length() > 4' --> right click --> Refactore --> "Extract Local Variable"
		//									--> Rename predicate Name --> Ok.
		//Predicate<? super String> sizeCheckPredicate = str -> str.length() > 4;
		//courses.stream().filter(sizeCheckPredicate ).forEach(System.out::println);
	
		//=> Predicate Implementation:-
		//   ------------------------
		// Use Predicate Implementation in filter() : Find Strings which size is more than 4 from the list of courses.

		Predicate<? super String> sizeCheckPredicate2 = new Predicate<String>() {
			@Override
			public boolean test(String str) {
				return  str.length() > 4;
			}
		};
		courses.stream().filter(sizeCheckPredicate2).forEach(System.out::println);
	
	}

}
