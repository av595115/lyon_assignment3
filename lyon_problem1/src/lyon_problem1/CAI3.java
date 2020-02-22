package lyon_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 {
	int num1;
	int num2;
	int answer;
	int score;
	int nextAction;
	static Scanner input = new Scanner(System.in);
	static SecureRandom num = new SecureRandom();
	
	public static void main(String[] args) {
	CAI3 app = new CAI3();
	app.quiz();
	}
	
	public void quiz(){
		score = 0;
		askQuestion();
		displayCompletionMessage();
	}
	
	public void askQuestion() {
		for (int i = 0; i < 10; i++) {
			num1 = num.nextInt(10);
			num2 = num.nextInt(10);
			System.out.printf("What is %d * %d?", num1, num2);
			readResponse();
			}
	}
	
	public void readResponse() {
		answer = input.nextInt();
		isAnswerCorrect();
	}
	
	public void isAnswerCorrect() {
		SecureRandom ran = new SecureRandom();
		int promptResponse = 1 + ran.nextInt(4);
		
		if (answer == (num1*num2)) {
			switch (promptResponse) {
			case 1: if (promptResponse == 1) {
				System.out.println("Very good!");
				score ++;
				return;
			}
			case 2: if (promptResponse == 2) {
				System.out.println("Excellent!");
				score ++;
				return;
			}
			case 3: if (promptResponse == 3) {
				System.out.println("Nice work!");
				score ++;
				return;
			}
			case 4: if (promptResponse == 4) {
				System.out.println("Keep up the good work!");
				score ++;
				return;
			}
			}
		}
		else {
			switch (promptResponse) {
			case 1: if (promptResponse == 1) {
				System.out.println("No. Please try again.");
				return;
			}
			case 2: if (promptResponse == 2) {
				System.out.println("Wrong. Try once more.");
				return;
			}
			case 3: if (promptResponse == 3) {
				System.out.println("Don’t give up!");
				return;
			}
			case 4: if (promptResponse == 4) {
				System.out.println("No. Keep trying.");
				return;
			}
			
		}
	}
	}
	
	public void displayCompletionMessage() {
		int percentage = (score*10);
		System.out.printf("Your score is: %d%%\n\n", percentage);
		if (percentage >= 75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
			nextPrompt();
			}
		else {
			System.out.println("Please ask your teacher for extra help.");
			nextPrompt();
		}
	}
	public void nextPrompt() {
		System.out.println("1 - Another Set\n2 - Maybe Later");
		nextAction = input.nextInt();
		
		switch (nextAction) {
		case 1: if (nextAction == 1) {
			quiz();
		}
		case 2: if (nextAction == 2) {
			System.out.println("Thank you for taking our quiz! Now smash that like button and subscribe for more amazing content!");
			return;
		}
		default: if (nextAction != 1 || nextAction != 2) {
			System.out.println("Please try again.");
			nextPrompt();
		}
	}
	}
}
	

