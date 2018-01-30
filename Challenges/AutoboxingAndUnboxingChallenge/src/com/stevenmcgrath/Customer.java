package com.stevenmcgrath;

import java.util.ArrayList;

public class Customer {
  private String name;
  private ArrayList<Double> transactionArrayList = new ArrayList<Double>();
  
  public Customer(String name, double initialAmount) {
    this.name = name;
    this.transactionArrayList = transactionArrayList;
    newTransaction(initialAmount);
  }
  
  public ArrayList<Double> getTransactionArrayList() {
    return transactionArrayList;
  }
  
  public String getName() {
    return name;
  }
  
  public boolean newTransaction(double value) {
    return this.transactionArrayList.add(value);
  }
  
}
