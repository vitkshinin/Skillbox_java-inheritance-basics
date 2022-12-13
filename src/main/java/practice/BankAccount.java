package practice;

public class BankAccount {

  private double moneyOfAccount;

  public double getAmount() {
    return moneyOfAccount;
  }

  public void put(double amountToPut) {

    if (amountToPut > 0) {
      moneyOfAccount = moneyOfAccount + amountToPut;
    }
  }

  public void take(double amountToTake) {

    if(amountToTake <= moneyOfAccount) {
      moneyOfAccount = moneyOfAccount - amountToTake;
    }
  }
}
