package ru.skillbox;

public class Keyboard {

  private final String type;
  private final boolean keyboardBacklight;
  private final int weight;

  public int getWeight() {
    return weight;
  }

  public Keyboard(KeybordType type, KeyboardBacklight keyboardBacklight, int weight) {
    if (type == KeybordType.MECHANICAL) {
      this.type = "Механическая";
    } else {
      this.type = "Мембранная";
    }
    if (keyboardBacklight == KeyboardBacklight.YES) {
      this.keyboardBacklight = true;
    } else {
      this.keyboardBacklight = false;
    }
    this.weight = weight;
  }

  private String keyboardBacklightTOString() {
    if (this.keyboardBacklight) {
      return "Да";
    } else {
      return "Нет";
    }
  }

  public String toStringKeyboard() {
    return "Кдавиатура: " + "\n" + "Тип " + type + "\n" + "Наличие подсветки " + keyboardBacklightTOString() +
        "\n" + "Вес " + weight;
  }

}
