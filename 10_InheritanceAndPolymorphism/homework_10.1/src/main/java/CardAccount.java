public class CardAccount extends BankAccount {


  public void take(double amountToTake) {
    if (amountToTake <= amount) {
      amount = amount - (amountToTake + amountToTake/100);
    }
  }
}
