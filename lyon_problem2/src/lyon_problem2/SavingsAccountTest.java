package lyon_problem2;

public class SavingsAccountTest{

private static final double balance = 0;
static SavingsAccount saver1;
static SavingsAccount saver2;

public static void main(String[] args) {
	SavingsAccount(balance);
}

public static void SavingsAccount(double balance) {
		saver1 = new SavingsAccount(2000.00);
		saver2 = new SavingsAccount(3000.00);
		SavingsAccount.modifyInterestRate(0.04);
		System.out.println("Month: \t\t\tSaver1: \t\tSaver2:\n");

			for(int i = 1; i<= 12; i++) {
				saver1.calculateMonthlyInterest();
				saver2.calculateMonthlyInterest();
				System.out.printf("Balance for Month %d:\t", i);
				saver1.displayBalance();
				System.out.printf("\t\t");
				saver2.displayBalance();
				System.out.println();
			}
			
			System.out.println();
			System.out.println("Balance next month with 5% interest rate:\t");
			System.out.println();
			SavingsAccount.modifyInterestRate(0.05);
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.printf("Next month:\t\t");
			saver1.displayBalance();
			System.out.printf("\t\t");
			saver2.displayBalance();
			System.out.println();
	}	

}
