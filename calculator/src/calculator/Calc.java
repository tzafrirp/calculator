package calculator;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberA;
		int numberB;
		String operator;
	
		System.out.println("Your first number: ");
		numberA = sc.nextInt();
		Scanner operator1 = new Scanner(System.in);
		System.out.println("Your operator: ");
		operator = operator1.next();
		System.out.println("Your second number: ");
		numberB = sc.nextInt();
    		
		int sum = numberA + numberB;
		int sub = numberA - numberB;
		double mult = numberA * numberB;
		double por = numberA / numberB;
		float power=1;
	
		
		if (operator.equals( "+")) {
			System.out.println("The answer is: " + sum);
		}
		
		if (operator.equals( "-")) {
			System.out.println("The answer is: " + sub);
		}
		if (operator.equals("*")) {
			System.out.println("The answer is: " + mult);
		}
		if (operator.equals( "/")) {
			if (numberB==0) {
				System.out.println("Error!!!");
			} else
			System.out.println("The answer is: " + por);
		}
		if (operator.equals( "^")) {
			for(int i=1; i<=numberB; i++ ) {
				power = power*numberA;
			}
			System.out.println(power);
		}
				
		sc.close();
		operator1.close();
	}

}
