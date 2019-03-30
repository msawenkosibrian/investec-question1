package za.co.investec.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import za.co.investec.service.CalculateService;
import za.co.investec.vo.Factor;

public class CalculateServiceImpl implements CalculateService {

	@Override
	public Integer[] factors(int number) {

		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				numbers.add(i);
			}
		}
		return numbers.toArray(new Integer[1]);
	}

	@Override
	public int highestCommonFactor(int[] numbers) {
		
		List<Factor> factors = new ArrayList<Factor>();
		for (int i = 0; i < numbers.length; i++) {
			Factor factor = new Factor();
			factor.setNumber(numbers[i]);
			factor.setFactors(factors(numbers[i]));
			factors.add(factor);
		}
		Collections.sort(factors); 				
		return getHighestCommonFactor(factors.get(0).getFactors(), factors.get(1).getFactors());
	}
	
	private int getHighestCommonFactor(Integer[] a, Integer[] b) {
		
		int hcf = -1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					hcf = a[i];
					break;
				}
			}
		}
		return hcf;
	}
}
