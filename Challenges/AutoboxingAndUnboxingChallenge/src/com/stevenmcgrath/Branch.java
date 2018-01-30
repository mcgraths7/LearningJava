package com.stevenmcgrath;

import java.util.ArrayList;

public class Branch {
  private String name;
  private ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
  
  public Branch(String name) {
    this.name = name;
    this.customerArrayList = customerArrayList;
  }
  
  public String getName() {
    return name;
  }
  
  public ArrayList<Customer> getCustomerArrayList() {
    return customerArrayList;
  }
  
  public boolean createCustomer(String name, double initialTransaction) {
    return findCustomer(name) == null && this.customerArrayList.add(new Customer(name, initialTransaction));
  }
  
  public boolean addTransaction(String name, double value) {
    Customer existingCustomer = findCustomer(name);
    return existingCustomer != null && existingCustomer.newTransaction(value);
  }
  
  private Customer findCustomer(String name) {
    for (Customer customer:this.customerArrayList) {
      if (customer.getName().equals(name)) {
        return customer;
      }
    }
    return null;
  }
}
