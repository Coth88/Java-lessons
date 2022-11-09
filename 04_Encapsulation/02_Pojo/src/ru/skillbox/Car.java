package ru.skillbox;

public class Car {

  private String brand;
  private String model;
  private String color;
  private int price;

  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public int getPrice() {
    return price;
  }
}
