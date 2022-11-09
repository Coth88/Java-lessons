package ru.skillbox;

public class Cpu {

  private final int frequency;
  private final int coreCount;
  private final String vendor;
  private final int weight;

  public int getWeight() {
    return weight;
  }

  public Cpu(int frequency, int coreCount, CPUVendor vendor, int weight) {
    this.frequency = frequency;
    this.coreCount = coreCount;
    if (vendor == CPUVendor.AMD) {
      this.vendor = "AMD";
    } else {
      this.vendor = "Intel";
    }
    this.weight = weight;
  }

  public String toStringCPU() {
    return "Процессор: " + "\n" + "Частота " + frequency + "\n" + "Количество ядер " + coreCount +
        "\n" + "Производитель " + vendor + "\n" + "Вес " + weight;
  }

}
