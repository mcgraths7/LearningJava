package com.stevenmcgrath;

public class Main {
  public static void main(String[] args) {
    //initialize the bank
    Bank wellsFargo = new Bank("Wells Fargo");
    
    //initialize the branches
    wellsFargo.createBranch("Madison");
    wellsFargo.createBranch("Florham Park");
    wellsFargo.createBranch("Chatham");
    
    //initialize madison customers
    wellsFargo.addCustomer("Madison","Steven", 500.00);
    wellsFargo.addCustomer("Madison", "Kathy", 1000.00);
    wellsFargo.addCustomer("Madison","Jim", 2000.00);
    
    //initialize florham park customers
    wellsFargo.addCustomer("Florham Park", "Marie", 1500);
    wellsFargo.addCustomer("Florham Park", "Jimmy", 2500);
    
    //initialize chatham customers
    wellsFargo.addCustomer("Chatham", "Juan", 1200);
    
    //add additional transactions
    wellsFargo.addTransactionForCustomer("Madison", "Steven", 50.38);
    wellsFargo.addTransactionForCustomer("Madison", "Steven", 150.23);
    wellsFargo.addTransactionForCustomer("Madison", "Steven", 82.84);
    wellsFargo.addTransactionForCustomer("Madison", "Jim", 752.19);
    wellsFargo.addTransactionForCustomer("Madison", "Kathy", 91.92);
    wellsFargo.addTransactionForCustomer("Madison", "Kathy", 20.45);
    
    wellsFargo.addTransactionForCustomer("Florham Park", "Marie", 123.45);
    wellsFargo.addTransactionForCustomer("Florham Park", "Marie", 57.21);
    wellsFargo.addTransactionForCustomer("Florham Park", "Jimmy", 1193.24);
    
    wellsFargo.addTransactionForCustomer("Chatham", "Juan", 200.99);
    
    wellsFargo.customersAtBranch("Madison", false);
    
    wellsFargo.customersAtBranch("Florham Park", true);

//    if (!wellsFargo.addCustomer("Summit", "Joe", 1.23)) {
//      System.out.println("Summit branch does not exist");
//    }
//    wellsFargo.createBranch("Madison");
//
//    if (!wellsFargo.createBranch("Madison")) {
//      System.out.println("Branch already exists");
//    }
  }
}
