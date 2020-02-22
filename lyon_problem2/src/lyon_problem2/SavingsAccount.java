package lyon_problem2;

public class SavingsAccount {
	private static double annualInterestRate = 0.00;
	private double savingsBalance;

	public SavingsAccount(double balance) {
		this.savingsBalance = balance;
	}

	public void calculateMonthlyInterest() {
		double monthlyInterest;
		monthlyInterest = (double)(this.savingsBalance*annualInterestRate/12);
		this.savingsBalance+=monthlyInterest;
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate=newInterestRate;
	}
	
	public void displayBalance() {
		System.out.printf("$%.2f", this.savingsBalance);
	}

}
