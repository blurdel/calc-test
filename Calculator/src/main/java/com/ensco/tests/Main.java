package com.ensco.tests;

import com.ensco.calc.Calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();
		int sum = calc.evaluate("2+3+4");
		System.out.println("sum=" + sum);
		
	}

}
