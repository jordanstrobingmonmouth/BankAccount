import java.util.Scanner;



public class BankAccountTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double interestPct = .05;
		
		System.out.println("Enter Amount to Start Your Account: ");
		double newAmt = input.nextDouble();
		System.out.println("");
		
		BankAccount myBankAccount = new BankAccount(newAmt);
		myBankAccount.calcInterest(newAmt);
		
		System.out.println("Enter Amount to The Amount You Want to Deposit: ");
		double newDeposit = input.nextDouble();
		myBankAccount.deposit(newDeposit);
		
		System.out.println("Enter Amount to The Amount You Want to Withdraw: ");
		double newWithdrawal = input.nextDouble();
		myBankAccount.withdraw(newWithdrawal);
		
		
		System.out.println("Your balance is: " + myBankAccount.getBalance());

	}

}
