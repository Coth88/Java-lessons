public class BankAccount {

  protected double amount = 0;
  private boolean isTake = false;


  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0) {
      amount = amount + amountToPut;
    }
  }

  public void take(double amountToTake) {
    if (amountToTake <= amount && amountToTake > 0) {
      amount = amount - amountToTake;
      isTake = true;
    }
  }

  private boolean send(BankAccount receiver, double amount) {
    isTake = false;
    this.take(amount);
    if (isTake) {
      receiver.put(amount);
      return true;
    }
    return false;
  }
}
