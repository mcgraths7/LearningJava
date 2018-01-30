package com.stevenmcgrath;

import java.util.ArrayList;

public class MobilePhone {
  private ArrayList<Contact> contactList = new ArrayList<Contact>();
  
  public MobilePhone() {
    this.contactList = new ArrayList<Contact>();
  }
  
  public void addContact(Contact contact) {
    contactList.add(contact);
  }
  
  public void printContactDetails() {
    for (int i = 0; i < contactList.size(); i++) {
      System.out.println((i+1) + ": " + contactList.get(i));
    }
  }
  
  public void modifyContact(String oldName, String newName) {
    int position = findContact(oldName);
    if (position >= 0) {
      modifyContact(position, newName);
    }
  }
  
  public void removeContact(String name) {
    int position = findContact(name);
    if (position >= 0) {
      removeContact(position);
    }
  }

  
  private void modifyContact(int position, String newName) {
    contactList.set(position, new Contact(newName, contactList.get(position).getPhoneNumber()));
  }
  
  private void removeContact(int position) {
      contactList.remove(position);
  }
  
  private int findContact(String name) {
    return contactList.indexOf(name);
  }
  public boolean contactExists(String name) {
    int position = findContact(name);
    if (position >= 0) {
      return true;
    }
    return false;
  }
}
