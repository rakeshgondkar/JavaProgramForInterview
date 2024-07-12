package numberPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public void factorialNumber(int num) {
		int fact = 1;
		for(int i=num;i>=1;i--) {
			fact = fact*i;
		}
		System.out.println("Factorial of given number is: "+fact);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial:");
		int num = sc.nextInt();
		FactorialOfNumber ft = new FactorialOfNumber();
		ft.factorialNumber(num);
	}
}
