package com.javanew.features;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class JNF05DistinctAndSorted {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

//=> Distinct :-
//   ---------
		// 1. remove the duplicates numbers of list
	    //numbers.stream().distinct().forEach(System.out::println);
	    
//=> Sorted :-
//   ---------
		// 2. sort the list in increment/natural order
	    //numbers.stream().sorted().forEach(System.out::println);
	    
	    // 3. sort the list in Reverse order
	    //numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	    
	    // 4. sort and remove duplicated the list in increment/natural order
	    //numbers.stream().sorted().distinct().forEach(System.out::println);
	    
	    // 4. sort the list of courses by it's size of length.
	    courses.stream().sorted(Comparator.comparing( str -> str.length())).forEach(System.out::println);
	}

}
