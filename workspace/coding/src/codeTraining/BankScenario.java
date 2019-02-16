package codeTraining;

import java.util.Scanner;

public class BankScenario {

	public static void main(String[] args) {
		System.out.println("Welcome to our Bank ! ");
		System.out.println("* if you want to deposit please press 1 \n" + " * if you want to withdraw please press 2 ");
		BankAccount account = new BankAccount();
		account.name = "Ibadat";
		account.accountNumber = 123456789L;
		account.balance = 100000;

		Scanner sc = new Scanner();

		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("Please enter deposit ammount in double");
			double depositAmmount = sc.nextDouble();
			account.deposit(depositAmmount);

		} else if (option == 2) {
			System.out.println("Please enter withdraw amount in int");
			int withdrawAmmount = sc.nextInt();
			account.withdraw(withdrawAmmount);

		} else {
			System.out.println("Invalid input");
		}
		account.displayCardInfo();
		System.out.println("Final balance is " + account.getBalance());
	}

}
