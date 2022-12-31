package com.javanew.features;

import java.util.List;
import java.util.function.BiPredicate;

public class JNF11BiPredicateFunctionalInterface {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
	
//1. BiPredicate :- boolean test(T a, U b); -> accept 2 inputs of same/different types, return the boolean output.
		
		//BiPredicate<Integer, String> binaryOperator = (num , str ) -> num > 10 && str.length() > 5;
		
		//1.a> Find out the predicate FLAG if age is greater than 10 and Name is start with "S". using BiPredicate Functional Interface.
		BiPredicate<Integer, String> binaryOperator = (age , name ) -> {
			return age > 10 && name.endsWith("Singh");
			
		};
		
		System.out.println("BiPredicate Flag is: "+ binaryOperator.test(12, "Sushil Kumar Singh"));
		
	}
	
}
