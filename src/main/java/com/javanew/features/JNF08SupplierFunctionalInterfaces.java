package com.javanew.features;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class JNF08SupplierFunctionalInterfaces {

	public static void main(String[] args) {

//1. Supplier :- T get(); -> No input, return something.
		
		//1.a> Find out the 4 digit random numbers using Supplier Functional Interface.
		//Supplier<Integer> randomIntegerSupplier = () -> new Random().nextInt(1000);
		Supplier<Integer> randomIntegerSupplier1 = () -> {
			Random randomDigit = new Random();
			return randomDigit.nextInt(1000);
		};
		System.out.println("Random Number is: "+ randomIntegerSupplier1.get());
		
		//1.b> Find out the UUIDnumber using Supplier Functional Interface.
		Supplier<String> randomUUIDSupplier = () -> {
			UUID uuid =  UUID.randomUUID();
			return uuid.toString();
		};
		System.out.println("Random UUID is: "+ randomUUIDSupplier.get());
	}
	
}
