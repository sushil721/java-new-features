package com.javanew.features;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class JNF03MapAndFunction {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
//=> Map :-
		//  -------
		// 1. Find Square of all Even numbers from this list of numbers
		//numbers.stream().filter(x -> x % 2 == 0).map(s -> s*s).forEach(System.out::println);

		// 2. Find the number of charectors of all the courses title.
		//courses.stream().map(x -> x.length()).forEach(System.out::println);
		
//=> Function with Map :- take one type input and return another/same type output.
		//  -------------------
		// 3. Find the number of charectors of all the courses title using function.
		//Function<? super String, ? extends Integer> findSizeMapper = x -> x.length();
		//courses.stream().map(findSizeMapper).forEach(System.out::println);
		
//=> Function Implementation with Map :-
		//  ------------------------------------
		// 4. Find the number of charectors of all the courses title using function.
		/*Function<? super String, ? extends Integer> findSizeMapper2 = new Function<String, Integer>() {
			@Override
			public Integer apply(String str) {
				return str.length();
			}
		};
		courses.stream().map(findSizeMapper2).forEach(System.out::println);
	   */
		
//=> Function and predicate with Map and filter :-
		//  ------------------------------------
		// 5. Find the number of charectors of all the courses title using function.
		/*Predicate<? super String> findContainsPredicate = str -> str.contains("A");
		
		Function<? super String, ? extends Integer> findSizeMapper3 = x -> x.length();
					// Input Type   // Output Type
		courses.stream().filter(findContainsPredicate).map(findSizeMapper3).forEach(System.out::println);
		*/
		
//=> Function and predicate with Map and filter :-
		//  ------------------------------------
		// 6tu. Find the number of charectors of all the courses title using function.
		Predicate<? super String> findContainsPredicate = new Predicate<String>() {
			@Override
			public boolean test(String str) {
				return str.contains("A");
			}
		};
		
		Function<? super String, ? extends Integer> findSizeMapper3 = new Function<String, Integer>(){
			@Override
			public Integer apply(String str) {
				return  str.length();
			}
		};
		courses.stream().filter(findContainsPredicate).map(findSizeMapper3).forEach(System.out::println);

		
	}

}
