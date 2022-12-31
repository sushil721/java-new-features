package com.javanew.features;

import java.util.List;
import java.util.function.BiConsumer;

public class JNF13BiConsumerFunctionalInterface {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
	
//1. BiConsumer :- void accept(T a, U b); -> accept 2 inputs parameters of same/different types, and return No any output after processing.
		
		BiConsumer<Integer, String> biFunction = (num , str ) -> System.out.println( "Name is: "+str+" and Age is: "+num);
		
		biFunction.accept(5, "Sushil");
		//1.a> Find out the Details of user by age and name. using BiFunction Functional Interface.
	
	}
	
}
