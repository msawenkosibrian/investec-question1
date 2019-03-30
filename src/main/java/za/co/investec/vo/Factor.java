package za.co.investec.vo;

import java.util.Arrays;

public class Factor implements Comparable<Factor> {

	private int number;
	private Integer[] factors;
	private int size;
	
	public int getNumber() {
		
		return number;
	}
	
	public void setNumber(int number) {
		
		this.number = number;
	}
	
	public Integer[] getFactors() {
		
		return factors;
	}
	
	public void setFactors(Integer[] factors) {
		
		this.factors = factors;
	}
	
	public int getSize() {
		
		return factors.length;
	}

	@Override
	public String toString() {
		
		return "Factor [number=" + number + ", factors=" + Arrays.toString(factors) + "]";
	}

	@Override
	public int compareTo(Factor o) {
				
		return getSize() - ((Factor)o).getSize();
	}	
}
