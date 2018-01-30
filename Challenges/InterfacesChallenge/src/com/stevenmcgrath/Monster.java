package com.stevenmcgrath;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
  private String type;
  private int level;
  private int hp;

  public Monster(String type, int level, int hp) {
    this.type = type;
    this.level = level;
    this.hp = hp;
  }


  @Override
  public List<String> write() {
    List<String> savedData = new ArrayList<String>();
    savedData.add(0, this.type);
    savedData.add(1, Integer.toString(this.level));
    savedData.add(2, Integer.toString(this.hp));
    return savedData;
  }

  @Override
  public void read(List<String> savedValues) {
    if (savedValues != null && savedValues.size() > 0) {
      this.type = savedValues.get(0);
      this.level = Integer.parseInt(savedValues.get(1));
      this.hp = Integer.parseInt(savedValues.get(2));
    }
  }

  @Override
  public String toString() {
    return "Monster{" +
        "type='" + type + '\'' +
        ", level=" + level +
        ", hp=" + hp +
        '}';
  }

  public String getType() { return type; }

  public int getLevel() {
    return level;
  }

  public int getHp() {
    return hp;
  }


}
