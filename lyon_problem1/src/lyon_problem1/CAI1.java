package lyon_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	int num1;
	int num2;
	int answer;
	Scanner input = new Scanner(System.in);
	SecureRandom num = new SecureRandom();
	
	public static void main(String[] args) {
		CAI1 app = new CAI1();
	    app.quiz();
	}
	
	public void quiz(){
		num1 = num.nextInt(10);
		num2 = num.nextInt(10);
		askQuestion();
	}
	
	public void askQuestion() {
		System.out.printf("What is %d * %d?\n", num1, num2);
		readResponse();
	}
	
	public void readResponse() {
		answer = input.nextInt();
		isAnswerCorrect();
	}
	
	public void isAnswerCorrect() {
		if (answer == (num1*num2)) {
			System.out.println("Very good!");
			return;
		}
		else {
			System.out.println("Sorry, please try again!");
			askQuestion();
		}
	}

}
