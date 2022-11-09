package ru.skillbox;

public class Ram {

  private final String type;
  private final int volume;
  private final int weight;

  public int getWeight() {
    return weight;
  }

  public Ram(RAMType type, int volume, int weight) {
    if (type == RAMType.DDR2) {
      this.type = "DDR2";
    } else if (type == RAMType.DDR3) {
      this.type = "DDR3";
    } else {
      this.type = "DDR4";
    }
    this.volume = volume;
    this.weight = weight;
  }

  public String toStringRAM() {
    return "Оперативаня память: " + "\n" + "Тип " + type + "\n" + "Объем " + volume +
        "\n" + "Вес " + weight;
  }
}
