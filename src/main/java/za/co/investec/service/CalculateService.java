package za.co.investec.service;

import java.util.List;

import za.co.investec.vo.Factor;

public interface CalculateService {

	public List<Factor> getFactors();
	public int highestCommonFactor(int[] numbers); 
}
