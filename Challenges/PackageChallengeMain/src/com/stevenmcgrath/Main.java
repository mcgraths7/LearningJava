package com.stevenmcgrath;

import com.series.fibonacci.MySeries;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MySeries mySeries = new MySeries();
        for (int i = 0; i < 10; i++) {
            System.out.println(mySeries.factorial(i));
        }
        System.out.println("==========");
        for (int i = 0; i < 10; i++) {
            System.out.println(mySeries.nSum(i));
        }
        System.out.println("==========");
        for (int i = 0; i < 10; i++) {
            System.out.println(mySeries.fibonacci(i));
        }
        
    }
}
