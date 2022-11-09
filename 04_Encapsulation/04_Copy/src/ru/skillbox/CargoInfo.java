package ru.skillbox;

public class CargoInfo {

  private final Dimensions dimensions;
  private final int weight;
  private final String deliveryAdress;
  private final String overturn;
  private final String registrationNumber;
  private final String fragile;


  public CargoInfo(Dimensions dimensions) {
    this.dimensions = dimensions;
    weight = 0;
    deliveryAdress = "N/A";
    overturn = "N/A";
    registrationNumber = "N/A";
    fragile = "N/A";

  }

  public CargoInfo(Dimensions dimensions, int weight, String deliveryAdress, String overturn,
      String registrationNumber, String fragile) {
    this.dimensions = dimensions;
    this.weight = weight;
    this.deliveryAdress = deliveryAdress;
    this.overturn = overturn;
    this.registrationNumber = registrationNumber;
    this.fragile = fragile;
  }

  public CargoInfo setWeight(int weight) {
    return new CargoInfo(dimensions, weight, deliveryAdress, overturn, registrationNumber, fragile);
  }

  public CargoInfo setDeliveryAdress(String deliveryAdress) {
    return new CargoInfo(dimensions, weight, deliveryAdress, overturn, registrationNumber, fragile);
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public int getWeight() {
    return weight;
  }

  public String getDeliveryAdress() {
    return deliveryAdress;
  }

  public String getOverturn() {
    return overturn;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public String getFragile() {
    return fragile;
  }


  public String toString() {
    return "\n" + dimensions + "\n" +
        "масса: " + weight + "\n" +
        "Адрес доставки: " + deliveryAdress + "\n" +
        "Можно переворачивать: " + overturn + "\n" +
        "Регистрационный номер: " + registrationNumber + "\n" +
        "Хрупкий: " + fragile;
  }
}
