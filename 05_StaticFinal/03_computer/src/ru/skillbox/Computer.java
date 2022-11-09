package ru.skillbox;

public class Computer {

  private static final String VENDOR = "HP";
  private static final String NAME = "Laptop";

  private final Cpu cpu;
  private final Ram ram;
  private final HardDisk hardDisk;
  private final Display display;
  private final Keyboard keyboard;

  private int totalWeight;


  public Computer(Cpu cpu, Ram ram, HardDisk hardDisk, Display display, Keyboard keyboard) {
    this.cpu = cpu;
    this.ram = ram;
    this.hardDisk = hardDisk;
    this.display = display;
    this.keyboard = keyboard;

  }

  public int totalWeight() {
    totalWeight = cpu.getWeight() + ram.getWeight() + hardDisk.getWeight() +
        display.getWeight() + keyboard.getWeight();
    return totalWeight;
  }

  public Cpu getCpu() {
    return cpu;
  }

  public Ram getRam() {
    return ram;
  }

  public HardDisk getHardDisk() {
    return hardDisk;
  }

  public Display getDisplay() {
    return display;
  }

  public Keyboard getKeyboard() {
    return keyboard;
  }

  public Computer setCPU(Cpu cpu) {
    return new Computer(cpu, ram, hardDisk, display, keyboard);
  }

  public Computer setRAM(Ram ram) {
    return new Computer(cpu, ram, hardDisk, display, keyboard);
  }

  public Computer setHardDisk(HardDisk hardDisk) {
    return new Computer(cpu, ram, hardDisk, display, keyboard);
  }

  public Computer setDisplay(Display display) {
    return new Computer(cpu, ram, hardDisk, display, keyboard);
  }

  public Computer setKeyboard(Keyboard keyboard) {
    return new Computer(cpu, ram, hardDisk, display, keyboard);
  }

  public String toString() {
    return "Производитель: " + VENDOR + "\n" + "Название: " + NAME +
        "\n" + "\n" + cpu.toStringCPU() +
        "\n" + "\n" + ram.toStringRAM() +
        "\n" + "\n" + hardDisk.toStringHardDisk() +
        "\n" + "\n" + display.toStringDisplay() +
        "\n" + "\n" + keyboard.toStringKeyboard();
  }


}
