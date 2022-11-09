package ru.skillbox;

public class HardDisk {

  private final String type;
  private final int volume;
  private final int weight;

  public int getWeight() {
    return weight;
  }

  public HardDisk(HardDiskType type, int volume, int weight) {
    if (type == HardDiskType.HDD) {
      this.type = "HDD";
    } else {
      this.type = "SSD";
    }
    this.volume = volume;
    this.weight = weight;
  }

  public String toStringHardDisk() {
    return "Жесткий диск: " + "\n" + "Тип " + type + "\n" + "Объем " + volume +
        "\n" + "Вес " + weight;
  }
}
