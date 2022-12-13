package practice;

import java.time.LocalDate;
public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        lastIncome = LocalDate.now();
        super.put(amountToPut);
    }
    @Override
    public void take(double amountToTake) {
        if (LocalDate.now().minusMonths(1).isAfter(lastIncome)) {
            super.take(amountToTake);
        }
    }
}
