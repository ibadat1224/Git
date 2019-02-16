package javaclasses;

public class ActualBankV2 {
  public static void main(String[] args) {
//	BankAccountV2 account=new BankAccountV2();
	
	//account.setAccountNumber(12345);
	//account.showBalance();
	 
	// account.setAccountNumber(543231);
	// account.showBalance();
	 
	// account.setBalance(10000);
	// account.showBalance();
	 
	// account.deposit(500);
	// account.showBalance();
	 
	// account.withdraw(2000);
	//account.showBalance();
	 
	//int wholeBalance=account.balance;
	// account.withdraw(wholeBalance);
	// account.showBalance();
	 
	// account.withdraw(200);
	// account.showBalance();
		
		BankAccountV2 bankAccount=new BankAccountV2();
		bankAccount.setBalance(200);
		
		bankAccount.withdraw(800);
		
		bankAccount.showBalance();
		
		bankAccount.withdraw(150);
		bankAccount.showBalance();
		
	}
}
	 

	
	
