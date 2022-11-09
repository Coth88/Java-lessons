import java.time.LocalDate;

public class DepositAccount extends BankAccount {

  private  LocalDate lastIncome;

  public void put(double amountToPut) {
    if (amountToPut >= 0) {
      amount = amount + amountToPut;
      lastIncome = LocalDate.now();
    }
  }

  public void take(double amountToTake) {
    if (amountToTake <= amount && LocalDate.now().isAfter(lastIncome.plusMonths(1)) ) {
     amount = amount - amountToTake;
      }
    }
}
