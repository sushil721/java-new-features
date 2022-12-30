package com.javanew.features;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class JNF04Reduce {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
// map() vs reduce() -> "map" means converting a series of inputs to an equal length series of outputs 
//					while "reduce" means converting a series of inputs into a smaller number of outputs.
//=> Reduce :-
//  -------
		// 1. Find Sum of all numbers of the list
		//int sum = numbers.stream().reduce(0, (x , y) -> x+y );
		
		// 2. Find Sum of all numbers of the list by predefine method sum
		//int sum = numbers.stream().reduce(0, Integer::sum );
		//System.out.println("Total sum is : "+ sum);
		
		// 3. Find MAXIMUM of all numbers of the list 
		//int max = numbers.stream().reduce(0, (x, y) -> x > y ? x : y );
		//System.out.println("Maximum value of list is : "+max);
		
		// 4. Find MAXIMUM of all numbers of the list and include -ve value as well in list
		//int max = numbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y );
		//System.out.println("Maximum value of list is : "+max);
		
		// 5. Find MINIMUM of all numbers of the list and include -ve value as well in list
		//int min = numbers.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y );
		//System.out.println("Maximum value of list is : "+min);
		
		// 6. Find SQUARE of every numbers of the list's SUM.
		int squareSum = numbers.stream().map( x -> x * x ).reduce(0, Integer::sum );
		System.out.println("SUM of SQUARE of list is : "+squareSum);
		
		// 7. Find SUM of every EVEN number's square of the list.
		int evenSquareSum = numbers.stream().filter( x -> x % 2 == 0 ).map( x -> x * x ).reduce(0, Integer::sum );
		System.out.println("SUM of Squre of every Even of list is : "+evenSquareSum);
		
		// 8. Find SUM of every EVEN number's square of the list using Functinal Interfaces.
		Predicate<? super Integer> isEvenPredicate = x -> x % 2 == 0;
		int evenSquareSumFunctinal = numbers.stream().filter( isEvenPredicate ).map( x -> x * x ).reduce(0, Integer::sum );
		System.out.println("SUM of Squre of every Even of list is : "+evenSquareSumFunctinal);
	}

}
