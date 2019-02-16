package javaclasses;

public class BankAccountV2 {
	int accountNumber;
	String accountHolder;
	double balance;
	String bank;

	public void setAccountNumber(int accNum){
		accountNumber=accNum;
}
public void setBalance(int amount){
	System.out.println("Setting balance:$"+amount);
	balance=amount;

}
public void deposit(int amount){
	System.out.println("Depositing $"+amount);
balance=balance+amount;
}
public void withdraw(int amount){
	System.out.println("Withdrawing $"+amount);
	balance-=amount;
}
	
	public void showBalance(){
	System.out.println("");	
	}
}


