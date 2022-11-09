public abstract class Client {

  protected static final int LIMIT = 1000;
  protected static final double MAX_PERCENT = 0.01;
  protected static final double MIN_PERCENT = 0.005;
  protected String noCommission = "без комиссии";
  protected String maxCommission = "комиссия составляет 1%";
  protected String minCommission = "комиссия составляет 0.5%";
  protected double amount;


  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0) {
      amount = amount + amountToPut;
    }
  }

  public void take(double amountToTake) {
    if (amountToTake < amount) {
      amount = amount - amountToTake;
    }
  }

  public void accountInformation() {
    System.out.printf("Баланс: %s руб. \n", getAmount());
    System.out.format("Зачисление: %s \n", noCommission);
    System.out.format("Снятие: %s \n", noCommission);
  }

}
