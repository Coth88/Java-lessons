package ru.skillbox;

public class Book {

  private final String name;
  private final String nameAvtor;
  private final int pagesCount;
  private final int numberIsbn;

  public Book(String name, String nameAvtor, int pagesCount, int numberIsbn) {
    this.name = name;
    this.nameAvtor = nameAvtor;
    this.pagesCount = pagesCount;
    this.numberIsbn = numberIsbn;
  }

  public String getName() {
    return name;
  }

  public String getNameAvtor() {
    return nameAvtor;
  }

  public int getPagesCount() {
    return pagesCount;
  }

  public int getNumberIsbn() {
    return numberIsbn;
  }
}
