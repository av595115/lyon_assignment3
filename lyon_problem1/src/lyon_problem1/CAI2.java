package lyon_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	int num1;
	int num2;
	int answer;
	Scanner input = new Scanner(System.in);
	SecureRandom num = new SecureRandom();
	
	public static void main(String[] args) {
		CAI2 app = new CAI2();
	    app.quiz();
	}
	
	public void quiz(){
		num1 = num.nextInt(10);
		num2 = num.nextInt(10);
		askQuestion();
	}
	
	public void askQuestion() {
		System.out.printf("What is %d * %d?", num1, num2);
		readResponse();
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
				return;
			}
			case 2: if (promptResponse == 2) {
				System.out.println("Excellent!");
				return;
			}
			case 3: if (promptResponse == 3) {
				System.out.println("Nice work!");
				return;
			}
			case 4: if (promptResponse == 4) {
				System.out.println("Keep up the good work!");
				return;
			}
			}
		}
		else {
			switch (promptResponse) {
			case 1: if (promptResponse == 1) {
				System.out.println("No. Please try again.");
				askQuestion();
			}
			case 2: if (promptResponse == 2) {
				System.out.println("Wrong. Try once more.");
				askQuestion();
			}
			case 3: if (promptResponse == 3) {
				System.out.println("Don’t give up!");
				askQuestion();
			}
			case 4: if (promptResponse == 4) {
				System.out.println("No. Keep trying.");
				askQuestion();
			}
			
		}
	}
	}
	}
	

