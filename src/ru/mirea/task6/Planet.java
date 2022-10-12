package ru.mirea.task6;

public class Planet implements Nameable{
    String name;
  @Override
    public String getName(){
      return name;
  }
  public Planet(String name){this.name=name;}
}
