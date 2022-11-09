public class LegalPerson extends Client {

  public void put(double amountToPut) {
    if (amountToPut > 0) {
      amount = amount + amountToPut;
    }
  }

  public void take(double amountToTake) {
    if (amountToTake < amount) {
      amount = amount - (amountToTake + amountToTake * MAX_PERCENT);
    }
  }


  public void accountInformation() {
    System.out.printf("Баланс: %s руб. \n", getAmount());
    System.out.format("Зачисление: %s \n", noCommission);
    System.out.format("Снятие: %s \n", maxCommission);
  }
}
