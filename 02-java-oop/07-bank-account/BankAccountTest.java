public class BankAccountTest {
    public static void main (String [] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Bank Account Number: " + bankAccount.accountNumber);
        
        System.out.println("There are " + bankAccount.accounts() " total bank accounts.")

		bankAccount.depositMoney("Checking", 700);
		System.out.println(bankAccount.getCheckingBalance());
		
		bankAccount.withdrawMoney("Checking", 20);
		System.out.println(bankAccount.getCheckingBalance());
		
		bankAccount.depositMoney("Savings", 200);
		System.out.println(bankAccount.getSavingBalance());
		
		bankAccount.withdrawMoney("Savings", 201);
		System.out.println(bankAccount.getSavingBalance());
		
		bankAccount.totalMoney();
    }
}