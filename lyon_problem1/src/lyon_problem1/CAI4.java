package lyon_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {
	 int num1 = 0;
	 int num2 = 0;
	 int answer = 0;
	 int score = 0;
	 int nextAction;
	 int difficulty;
	 Scanner input = new Scanner(System.in);
	 SecureRandom num = new SecureRandom();
	
	public static void main(String[] args) {
		CAI4 app = new CAI4();
	    app.quiz();
	    app.displayCompletionMessage();
	}
	
	public void quiz(){
		score = 0;
		readDifficulty();
	}
	
	public void askQuestion() {
		System.out.printf("What is %d * %d?", num1, num2);
		readResponse();
	}
	public void readDifficulty() {
		System.out.println("Choose difficulty level:\n1 - Numbers between 0-9\n2 - Numbers between 0-99\n3 - Numbers between 0-999\n4 - Numbers between 0-9999");
		difficulty = input.nextInt();
		generateQuestionArgument();
	}
	
	public void generateQuestionArgument() {
		switch (difficulty) {
		case 1: if (difficulty == 1) {
			for (int i = 0; i < 10; i++) {
				num1 = num.nextInt(10);
				num2 = num.nextInt(10);
				askQuestion();
				}
		}
		case 2: if (difficulty == 2) {
			for (int i = 0; i < 10; i++) {
				num1 = num.nextInt(100);
				num2 = num.nextInt(100);
				askQuestion();
				}
		}
		case 3: if (difficulty == 3) {
			for (int i = 0; i < 10; i++) {
				num1 = num.nextInt(1000);
				num2 = num.nextInt(1000);
				askQuestion();
				}
		}
		case 4: if (difficulty == 4) {
			for (int i = 0; i < 10; i++) {
				num1 = num.nextInt(10000);
				num2 = num.nextInt(10000);
				askQuestion();
				}
		}
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
	

