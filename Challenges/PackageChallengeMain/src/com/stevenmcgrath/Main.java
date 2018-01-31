package com.stevenmcgrath;

import com.series.fibonacci.MySeries;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i <= 10; i++) {
            System.out.println(MySeries.factorial(i));
        }
        System.out.println("==========");
        for (int i = 0; i <= 10; i++) {
            System.out.println(MySeries.nSum(i));
        }
        System.out.println("==========");
        for (int i = 0; i <= 10; i++) {
            System.out.println(MySeries.fibonacci(i));
        }
        
    }
}
