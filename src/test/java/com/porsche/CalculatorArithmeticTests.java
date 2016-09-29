package com.porsche;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorArithmeticTests {

	private Calculator calculator = new Calculator();
	
	@Test
	public void testSum() {
		int result = calculator.sum(2, 2);
		
		Assert.assertEquals("Should be equal", 4, result);
	}

	@Test
	public void testProduct() {
		int result = calculator.product(2, 3);
		
		Assert.assertEquals("Should be equal", 6, result);
	}

}
