public class IndividualBusinessman extends Client {


  public void put(double amountToPut) {
    if (amountToPut > 0) {
      if (amountToPut < LIMIT) {
        amount = amount + (amountToPut - amountToPut * MAX_PERCENT);
      }
      if (amountToPut >= LIMIT) {
        amount = amount + (amountToPut - amountToPut * MIN_PERCENT);
      }
    }
  }

  public void take(double amountToTake) {
    if (amountToTake < amount) {
      amount = amount - amountToTake;
    }
  }


  public void accountInformation() {
    System.out.printf("Баланс: %s руб. \n", getAmount());
    System.out.format("Зачисление: %s - если сумма до 1000 руб. %s - если сумма от 1000 руб \n", maxCommission, minCommission);
    System.out.format("Снятие: %s \n", noCommission);
  }
}

