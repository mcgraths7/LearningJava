package com.stevenmcgrath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Player player = new Player("Steven");
    saveObject(player);
  }

  public static ArrayList<String> readValues() {
    ArrayList<String> values = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    int index = 0;
    System.out.println("Choose\n " +
                    "1. Enter a string\n" +
                    "0. Quit");
    while (!quit) {
      int choice = scanner.nextInt();
      switch (choice) {
        case 0:
          quit = true;
          break;
        case 1:
          System.out.println("Enter a string");
          String stringInput = scanner.nextLine();
          index++;
          break;
      }
    }
    return values;
  }

  public static void saveObject(ISaveable objectToSave) {
    for (int i = 0; i < objectToSave.write().size(); i++) {
      System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
    }
  }

  public static void loadObject(ISaveable objectToLoad) {
    ArrayList<String> values = readValues();
    objectToLoad.read(values);
  }


}
