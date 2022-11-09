package ru.skillbox;

public class Country {

  private String name;
  private int population;
  private String capitalName;
  private boolean accessToSea;


  public Country(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public void setCapitalNAme(String capitalName) {
    this.capitalName = capitalName;
  }

  public void setAccessToSea(boolean accessToSea) {
    this.accessToSea = accessToSea;
  }

  public void getName(String name) {
    this.name = name;
  }

  public int getPopulation() {
    return population;
  }

  public String getCapitalName() {
    return capitalName;
  }

  public boolean isAccessToSea() {
    return accessToSea;
  }
}
