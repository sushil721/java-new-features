package com.javanew.features;

import java.util.function.UnaryOperator;

public class JNF09UnaryOperatorFunctionalInterfaces {

	public static void main(String[] args) {

//1. Unary Operator :- T apply(a); -> accept only one input, return the same type output.
		
		//1.a> Find out the multiply by 3 using UnaryOperator Functional Interface.
		UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
		System.out.println("Random Number is: "+ unaryOperator.apply(9));
		
	}
	
}
