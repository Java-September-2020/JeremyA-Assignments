public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public static void Accounts (){
    }

    public static AccountBalance (){
        return this.checkingBalance;
    }

    long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
}