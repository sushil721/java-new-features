package com.javanew.features;

import java.util.function.BinaryOperator;

public class JNF10BinaryOperatorFunctionalInterfaces {

	public static void main(String[] args) {

//1. Binary Operator :- T apply(a, b); -> accept 2 input of same types, return the same type single output.
		
		//1.a> Find out the Calculations using BinaryOperator Functional Interface.
		BinaryOperator<Integer> binaryOperator = (x , y ) -> x * y;
		System.out.println("BinaryOperator is: "+ binaryOperator.apply(9, 25));
		
		//1,b> Find SUM of Square of 2 digits.
		BinaryOperator<Integer> sumOfSquareBinaryOperator = (x , y ) -> x*x + y*y;
		System.out.println("SUM of Square is: "+ sumOfSquareBinaryOperator.apply(3, 5));
	}
	
}
