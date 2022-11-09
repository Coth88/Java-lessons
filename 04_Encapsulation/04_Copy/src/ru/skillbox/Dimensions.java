package ru.skillbox;

public class Dimensions {

  private final int width;
  private final int height;
  private final int length;

  public Dimensions() {
    width = 0;
    height = 0;
    length = 0;
  }

  public Dimensions(int width, int height, int length) {
    this.width = width;
    this.height = height;
    this.length = length;
  }


  public Dimensions setWidth(int width) {
    return new Dimensions(width, height, length);
  }

  public Dimensions setHeight(int height) {
    return new Dimensions(width, height, length);
  }

  public Dimensions setLength(int length) {
    return new Dimensions(width, height, length);
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int getLength() {
    return length;
  }


  public String toString() {
    return "ширина: " + width + "\n" +
        "высота: " + height + "\n" +
        "длина: " + length;
  }

  public void Volume() {
    System.out.println("объем груза: " + width * height * length);
  }
}
