package com.stevenmcgrath;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Branch> branchArrayList = new ArrayList<Branch>();
  
  public Bank(String name) {
    this.name = name;
    this.branchArrayList = branchArrayList;
  }
  
  public boolean createBranch(String branchName) {
    Branch existingBranch = findBranch(branchName);
    return existingBranch == null || this.branchArrayList.add(new Branch(branchName));
  }
  
  public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
    Branch currentBranch = findBranch(branchName);
    return currentBranch != null && currentBranch.createCustomer(customerName, initialTransaction);
  }
  
  private Branch findBranch(String branchName) {
    for (Branch branch:this.branchArrayList) {
      if (branch.getName().equals(branchName)) {
        return branch;
      }
    }
    return null;
  }
  
  public boolean addTransactionForCustomer(String branchName, String customerName, double transactionAmount) {
    Branch currentBranch = findBranch(branchName);
    return currentBranch != null && currentBranch.addTransaction(customerName, transactionAmount);
  }
  
  public boolean customersAtBranch(String branchName, boolean showTransactions) {
    Branch currentBranch = findBranch(branchName);
    if (currentBranch != null) {
      System.out.println("Customer details for the " + currentBranch.getName() + " branch.");
      for (Customer customer : currentBranch.getCustomerArrayList()) {
        System.out.println("Name: " + customer.getName());
        if (showTransactions) {
          System.out.println("Transactions: ");
          for (double transaction : customer.getTransactionArrayList()) {
            System.out.println("$" + transaction);
          }
        }
      }
      return true;
    }
    return false;
  }
}
