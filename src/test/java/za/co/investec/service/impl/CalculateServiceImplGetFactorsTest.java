package za.co.investec.service.impl;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import za.co.investec.service.CalculateService;
import za.co.investec.vo.Factor;

public class CalculateServiceImplGetFactorsTest {
	
	private static final int NUMBERS[] = {54, 24};
	private static final Integer FACTORS_54[] = {1, 2, 3, 6, 9, 18, 27, 54};
	private static final Integer FACTORS_24[] = {1, 2, 3, 4, 6, 8, 12, 24};
	
	CalculateService calculateService;
	
	@Test
	public void test() {
		
		calculateService = new CalculateServiceImpl();
		calculateService.highestCommonFactor(NUMBERS);
		List<Factor> factors = calculateService.getFactors();
		boolean x = false;
		boolean y = false;
		
		for (Factor factor: factors) {
			if (factor.getNumber() == NUMBERS[0]) { // 54
				x = Arrays.equals(factor.getFactors(), FACTORS_54); 
			}
			else if (factor.getNumber() == NUMBERS[1]) { // 24
				y = Arrays.equals(factor.getFactors(), FACTORS_24); 
			}
			else {
				x = y = false;
			}
		}
		assertTrue(x && y);
	}
}
