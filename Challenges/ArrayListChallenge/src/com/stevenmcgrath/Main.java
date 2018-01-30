package com.stevenmcgrath;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  
  private static Scanner scanner = new Scanner(System.in);
  private static MobilePhone myPhone = new MobilePhone();
  public static void main(String[] args) {
    boolean quit = false;
    int userChoice = 0;
    
    printInstructions();
    while (!quit) {
      String contactName;
      System.out.println("Enter your choice: ");
      userChoice = scanner.nextInt();
      switch (userChoice) {
        case 0:
          printInstructions();
          break;
        case 1:
          //printContacts();
          break;
        case 2:
          addContact();
          break;
        case 3:
          //modifyContact();
          break;
        case 4:
         // removeContact();
          break;
        case 5:
         // findContact();
          break;
        case 6:
          quit = true;
        default:
          System.out.println("Invalid choice, please try again");
          break;
      }
    }
    
    
  }
  
  public static void addContact() {
    System.out.println("Please enter the name and phone number of the contact:");
    String contactName = addContactName();
    String contactNumber = addContactNumber();
    myPhone.addContact(new Contact(contactName, contactNumber));
    System.out.println("Contact successfully added");
  }
  
  public static void modifyContact() {
    String newName;
    System.out.println("Enter the name of the contact you want to modify: ");
    String oldName = addContactName();
    if (myPhone.contactExists(oldName)) {
      System.out.println("Enter the new name of the contact: ");
      newName = addContactName();
      myPhone.modifyContact(oldName, newName);
    } else {
      doesNotExist();
    }
  }
  public static void removeContact() {
    String contactToRemove;
    System.out.println("Enter the name of the contact to remove: ");
    contactToRemove = addContactName();
    if (myPhone.contactExists(contactToRemove)) {
      myPhone.removeContact(contactToRemove);
    } else {
      doesNotExist();
    }
  }
  
  
  public static void searchForContact() {
    System.out.print("Enter contact name to search for: ");
    String contactToFind = addContactName();

  }
  private static String addContactName() {
    System.out.println("Name: ");
    return scanner.nextLine();
  }
  private static String addContactNumber() {
    System.out.println("Phone number: ");
    return scanner.nextLine();
  }
  
  private static void doesNotExist() {
    System.out.println("That contact does not exist in the list.");
  }
  
  public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of contacts.");
    System.out.println("\t 2 - To add a contact to the list.");
    System.out.println("\t 3 - To modify a contact in the list.");
    System.out.println("\t 4 - To remove a contact from the list.");
    System.out.println("\t 5 - To search for a contact in the list.");
    System.out.println("\t 6 - To quit the application.");
  }
  
}
