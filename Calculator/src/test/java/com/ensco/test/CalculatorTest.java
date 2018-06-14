package com.ensco.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.ensco.calc.Calculator;


public class CalculatorTest {
	
	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}
	
}