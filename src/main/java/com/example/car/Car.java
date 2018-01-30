package com.example.car;

public class Car extends Vehicle {
private String name;
public Car() {
    System.out.println("You have made a car. ");

    }
  public Car(String n)
  {
      this.name = n;
  }

public String start() {
    return "Your " + name + " has started";
    }
public String acel() {
    return "Your " +name +" is accelerating";
}
public String mph() {
    return "Your " + name + " is going 60 mph";
}
public String stop() {
    return "Your " +  name + " has stopped";
}


}
