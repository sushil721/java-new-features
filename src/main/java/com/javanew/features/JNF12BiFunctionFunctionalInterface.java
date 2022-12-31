package com.javanew.features;

import java.util.List;
import java.util.function.BiFunction;

public class JNF12BiFunctionFunctionalInterface {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
	
//1. BiFunction :- boolean apply(T a, U b, O o); -> accept 2 inputs parameters of same/different types, and return the one output after processing.
		
		BiFunction<Integer, String, String> biFunction = (num , str ) -> "Name is: "+str+" and Age is: "+num;
		
		//1.a> Find out the Details of user by age and name. using BiFunction Functional Interface.
		BiFunction<Integer, String, String> biFunction1 = (num , str ) -> {
			return "Name is: "+str+" and Age is: "+num;
		};
		
		System.out.println( biFunction1.apply(12, "Sushil Kumar Singh"));
		
		//1.b> Find out the the number of letters course title contains by age list of course and  converterName. using BiFunction Functional Interface.
		BiFunction<String, String, String> courseLength = (course , name ) -> {
			return "Course: "+ course+" have total "+course.length()+" length. Modified by: "+name;	
		};
		List<String> courseLengthResult = courses.stream()
				.map(x -> courseLength.apply(x, "Sushil Kumar Singh"))
				.toList();
		courseLengthResult.forEach(System.out::println);
	}
	
}
