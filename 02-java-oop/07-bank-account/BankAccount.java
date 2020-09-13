public class BankAccount {
    private String accountNumber;
	private double checkingBalance;
	private double savingBalance;
	public static int accountTotal = 0;
	public static double balanceStored = 0;
	
	public BankAccount() {
		accountNumber = randomAccountNum();
		accountTotal++;
	}
	
	private static String randomAccountNum() {
        StringBuilder word = new StringBuilder(10); 
        String randomAccountString = "0123456789";
        for (int i = 0; i < 10; i++){
            int index = (int)(randomAccountString.length() * Math.random());
            word.append(randomAccountString.charAt(index));
        }
        String words = String.valueOf(word.toString());
        return words;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public void depositMoney(String accountName, double amount) {
		if (accountName.equals("Checking")) {
			System.out.println("$" + amount + " added to Checking Balance.");
			checkingBalance += amount;
		}
		
		if (accountName.equals("Savings")) {
			System.out.println("$" + amount + " added to Saving Balance.");
			savingBalance += amount;
		}
	}
	
	public void withdrawMoney(String accountName, double amount) {
		if (accountName.equals("Checking")) {
			if (checkingBalance - amount >= 0) {
				System.out.println("$" + amount + " withdrawn to Checking Balance");
				checkingBalance -= amount;
			}
			else {
                System.out.println("Checking Account has: $" + checkingBalance + 
                ". Can't withdraw: $" + amount);
			}

		}
		
		if (accountName.equals("Savings")) {
			if (savingBalance - amount >= 0) {
				System.out.println("$" + amount + " withdrawn to Savings Balance");
				savingBalance -= amount;
			}
			else {
                System.out.println("Savings Account has: $" + savingBalance + 
                ". Can't withdraw: $" + amount);
			}

		}
	}
	
	public void totalMoney() {
        System.out.println("Checking & Savings Accounts have $" + (savingBalance + checkingBalance)
        + " total.");
	}
}