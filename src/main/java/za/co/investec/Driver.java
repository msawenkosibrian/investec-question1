package za.co.investec;

import java.util.Arrays;
import java.util.List;

import za.co.investec.service.CalculateService;
import za.co.investec.service.impl.CalculateServiceImpl;
import za.co.investec.vo.Factor;

public class Driver {
	
	public static void main(String[] args) {
		
		boolean isValid = true;
		
		if (args.length < 2) { // Two or more integers
            System.err.println("Please provide two or  more integers!");
            System.exit(0);
        }
		else {
			int[] numbers = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				try {
					numbers[i] = Integer.valueOf(args[i]);
				}
				catch (Exception e) {
					isValid = false;
		            break;
				}
			}
			if (isValid) {
				Arrays.sort(numbers);
				CalculateService calculateService = new CalculateServiceImpl();
				int hcf = calculateService.highestCommonFactor(numbers);
				List<Factor> factors = calculateService.getFactors();
				
				for (Factor factor: factors) {
					System.out.println(factor.toString());
				}
				System.out.println(String.format("Highest Common Denominator: %s", hcf));
			}
			else {
				System.err.println("Please provide two or  more integers!");
	            System.exit(0);
			}
		}
	}
}
