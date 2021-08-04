import java.util.Scanner;

public class SavingsAccount {
    static double annualInterestRate;

    Scanner sc = new Scanner(System.in);
    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    static void modifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }

     void CalculateMonthlyInterest() {
        double MonthlyIR = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += MonthlyIR;
        System.out.println("Account Balance  : " + savingsBalance);
    }
}
