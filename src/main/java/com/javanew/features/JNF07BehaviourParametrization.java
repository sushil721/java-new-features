package com.javanew.features;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class JNF07BehaviourParametrization {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15, 21);

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS",
				"PCF", "Azure", "Docker","Kubernetes");
		
		//1. Find Odd, Even, Divisible etc by Predicate parameter
		//filterAndPrint(numbers, x -> x % 2 == 0 ); // Even
		//filterAndPrint(numbers, x -> x % 2 == 1 ); // Odd
		//filterAndPrint(numbers, x -> x % 7 == 0 ); // Divisible
		
		//2. Find mathematical calculation by Function parameter
		//mapAndPrint(numbers, x -> x * x );
		mapAndPrint(numbers,  x -> x + x );
		
	}

	private static void mapAndPrint(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
		
		numbers.stream().map(mappingFunction).forEach(System.out::println);
		  
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		
		numbers.stream().filter(predicate).forEach(System.out::println);
	}
	
}
