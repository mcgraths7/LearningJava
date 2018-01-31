package com.series.fibonacci;

public class MySeries {
	private static int n1=0,n2=1,n3=0;

	public static long nSum(int index) {
		return ((index * (index + 1)) / 2);
	}
	
	public static long factorial(int index) {
		int product = 1;
		for (int i = 1; i <= index; i++) {
			product *= i;
		}
		return product;
	}
	
	public static long fibonacci(int index) {
		if (index == 0) {
			return 0;
		} else if (index == 1) {
			return 1;
		}
			long nMinusOne = 1;
			long nMinusTwo = 0;
			long fib = 0;
			for (int i = 1; i < index; index ++) {
				fib = (nMinusTwo + nMinusOne);
				nMinusTwo = nMinusOne;
				nMinusOne = fib;
			}
		return fib;
	}
}
