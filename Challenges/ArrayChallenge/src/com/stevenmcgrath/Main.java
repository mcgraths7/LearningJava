package com.stevenmcgrath;

import java.util.Scanner;



public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " integer values.\r");
    int[] values = new int[number];
    for (int i = 0; i < values.length; i++) {
      values[i] = scanner.nextInt();
    }
    return values;
  }
  public static void printArray(int[] values ){
    System.out.println("The sorted contents of the array are: ");
    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }
  }

  public static void main(String[] args) {
    MyQuickSort sorter = new MyQuickSort();
    int[] input = getIntegers(5);
    sorter.sort(input);
    printArray(input);
  }
}
