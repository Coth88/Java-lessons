package ru.skillbox;

public class Display {

  private final double displayDiagonal;
  private final String type;
  private final int weight;

  public int getWeight() {
    return weight;
  }

  public Display(double displayDiagonal, DisplayType type, int weight) {
    this.displayDiagonal = displayDiagonal;
    if (type == DisplayType.IPS) {
      this.type = "IPS";
    } else if (type == DisplayType.TN) {
      this.type = "TN";
    } else
      this.type = "VA";
    this.weight = weight;
  }

  public String toStringDisplay() {
    return "Экран: " + "\n" + "Диагональ " + displayDiagonal + "\n" + "Тип " + type +
        "\n" + "Вес " + weight;
  }
}

