package com.javanew.features;

import java.util.List;
import java.util.stream.Collectors;

public class JNF06CollectAndCollectors {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS",
				"PCF", "Azure", "Docker","Kubernetes");

//=> Collect :-
//   ---------
		// 1. create a SQUARE of list from main list
		List<Integer> squareList = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("The SQUARE LIST is: " + squareList);

		// 2. create a SQUARE of all Even numbers of list from main list
		List<Integer> evenSquareList = numbers.stream().filter(x -> x % 2 == 0).map(x -> x * x)
				.collect(Collectors.toList());
		System.out.println("The EVEN's SQUARE LIST is: " + evenSquareList);

		// 2. create a List of integer from length of courses.
		List<Integer> lengthOfCourses = courses.stream().map(str -> str.length()).collect(Collectors.toList());
		System.out.println("The lengths of courses is: " + lengthOfCourses);

	}

}
