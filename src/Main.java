public class Main {
    public static void main(String[] args) {

        SavingsAccount Account1 = new SavingsAccount();
        SavingsAccount.modifyInterestRate(0.04);
        Account1.setSavingsBalance(1000);
        System.out.println("For User 1 : ");
        Account1.CalculateMonthlyInterest();

        SavingsAccount Account2 = new SavingsAccount();
        Account2.setSavingsBalance(2000);
        System.out.println("For User 2 : ");
        Account2.CalculateMonthlyInterest();
    }

}
