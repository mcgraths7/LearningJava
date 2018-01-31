package com.stevenmcgrath;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
  private String name;
  private int level;
  private int hp;

  public Player(String name) {
    this.name = name;
    this.level = 1;
    this.hp = 100;
  }

  public String getName() {
    return name;
  }

  public int getLevel() {
    return level;
  }

  public int getHp() {
    return hp;
  }

  @Override
  public List<String> write() {
    List<String> savedData = new ArrayList<String>();
    savedData.add(0, this.name);
    savedData.add(1, Integer.toString(this.level));
    savedData.add(2, Integer.toString(this.hp));
    return savedData;
  }

  @Override
  public void read(List<String> savedValues) {
    if (savedValues != null && savedValues.size() > 0) {
      this.name = savedValues.get(0);
      this.level = Integer.parseInt(savedValues.get(1));
      this.hp = Integer.parseInt(savedValues.get(2));
    }
  }

  @Override
  public String toString() {
    return "Player{" +
        "name='" + name + '\'' +
        ", level=" + level +
        ", hp=" + hp +
        '}';
  }


}
