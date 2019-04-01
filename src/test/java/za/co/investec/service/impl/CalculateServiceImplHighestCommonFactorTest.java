package za.co.investec.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import za.co.investec.service.CalculateService;

public class CalculateServiceImplHighestCommonFactorTest {
	
	private static final int NUMBERS[] = {54, 24};
	
	CalculateService calculateService;

	@Test
	public void test() {
		
		calculateService = new CalculateServiceImpl();
		int actual = calculateService.highestCommonFactor(NUMBERS);
		int expected = 6;
		assertTrue(actual == expected);
	}
}
