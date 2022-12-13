package practice;

public class CardAccount extends BankAccount {
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
    public void take(double amountCashToTake) {
        amountCashToTake = (amountCashToTake / 100) + amountCashToTake;
        super.take(amountCashToTake);
    }
}
