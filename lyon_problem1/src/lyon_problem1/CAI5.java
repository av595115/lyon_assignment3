package lyon_problem1;
import java.security.SecureRandom;
import java.util.Scanner;


public class CAI5 {
	 int num1;
	 int num2;
	 double answer;
	 double userAnswer;
	 int score;
	 int nextAction;
	 int difficulty;
	 int level;
	 Scanner input = new Scanner(System.in);
	 SecureRandom num = new SecureRandom();
	
	public static void main(String[] args) {
		CAI5 app = new CAI5();
	    app.quiz();
	}
	
	public void quiz(){
		score = 0;
		askQuestion();
	}
	
	public void askQuestion() {
		System.out.println("Choose difficulty level:\n1 - Numbers between 0-9\n2 - Numbers between 0-99\n3 - Numbers between 0-999\n4 - Numbers between 0-9999");
		difficulty = input.nextInt();
		System.out.println("Choose problem type:\n1 - Addition Only\n2 - Multiplication only\n3 - Subraction Only\n4 - Division Only\n5 - Random Selection");
		level = input.nextInt();
		generateQuestionArgument();
	}
	
	public void generateQuestionArgument() {
		readDifficulty();
		readProblemType();
	}
	
	public void readDifficulty() {
		
		switch (difficulty) {
		case 1: if (difficulty == 1) {
				num1 = num.nextInt(10);
				num2 = num.nextInt(10);
		}
		case 2: if (difficulty == 2) {
				num1 = num.nextInt(100);
				num2 = num.nextInt(100);
		}
		case 3: if (difficulty == 3) {
				num1 = num.nextInt(1000);
				num2 = 1 + num.nextInt(1000);
		}
		case 4: if (difficulty == 4) {
				num1 = num.nextInt(10000);
				num2 = num.nextInt(10000);
		}
		}
	}
	
	public void readProblemType() {
		switch (level) {
		case 1: if (level == 1) {
			for (int i = 0; i < 10; i++) {
				readDifficulty();
				addition();
				}
		}
		case 2: if (level == 2) {
			for (int i = 0; i < 10; i++) {
				readDifficulty();
				multiplication();
				}
		}
		case 3: if (level == 3) {
			for (int i = 0; i < 10; i++) {
				readDifficulty();
				subtraction();
			}
		}
		case 4: if (level == 4) {
			for (int i = 0; i < 10; i++) {
				readDifficulty();
				division();
			}
			}
			
		case 5: if (level == 5) {
			for (int i = 0; i < 10; i++) {
				readDifficulty();
				random();
			}
		}
	}
		displayCompletionMessage();
	}
	
	public void readResponse() {
		userAnswer = input.nextDouble();
		isAnswerCorrect();
	}
	
	public void isAnswerCorrect() {
		SecureRandom ran = new SecureRandom();
		int promptResponse = 1 + ran.nextInt(4);

			if (userAnswer == answer) {
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
	
	private void random() {
			SecureRandom ran2 = new SecureRandom();
			int random = 1 + ran2.nextInt(4);
			
			switch (random) {
			case 1: if (random == 1) {
				readDifficulty();
				addition();
			}
			case 2: if (random == 2) {
				readDifficulty();
				subtraction();
			}
			case 3: if (random == 3) {
				readDifficulty();
				multiplication();
				}
			case 4: if (random == 4) {
				readDifficulty();
				division();
			}
			}
	}

	private void division() {
		System.out.printf("How much is %d / %d? Please round to 2 decimal places.", num1, num2);
		double a = ((double) num1)/num2;
		answer = Math.round(a*100.0)/100.0;
		readResponse();
	}

	private void subtraction() {
		System.out.printf("How much is %d - %d?", num1, num2);
		answer = num1 - num2;
		readResponse();
	}

	private void multiplication() {
		System.out.printf("How much is %d * %d?", num1, num2);
		answer = num1 * num2;
		readResponse();
	}

	private void addition() {
		System.out.printf("How much is %d + %d?", num1, num2);
		answer = num1 + num2;
		readResponse();
	}
	
	public void displayCompletionMessage() {
		int percentage = (score*10);
		System.out.printf("\nYour score is: %d%%\n\n", percentage);
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
	
