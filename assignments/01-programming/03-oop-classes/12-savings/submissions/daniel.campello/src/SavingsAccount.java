public class SavingsAccount {

    private double savingsBalance;
    private static double annualInterestRate;

    public SavingsAccount(double savingsBalance) {
        if (savingsBalance < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double newRate) {
        if (newRate < 0) {
            throw new IllegalArgumentException("A taxa de juros anual não pode ser negativa.");
        }
        annualInterestRate = newRate;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate) / 12.0;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}