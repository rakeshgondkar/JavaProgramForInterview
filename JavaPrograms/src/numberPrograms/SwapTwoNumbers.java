package numberPrograms;

import java.util.Scanner;


/*
 * swapping two numbers is changing the value of variables
 * if a = 10, b = 20 then output should be
 * a = 20, b = 10
 * @num1 is Number1 which user provides as a input
 * @num2 is Number2 which user provides as a input
 */
public class SwapTwoNumbers {
	
	public void swapNumbers(int num1,int num2) {
		int temp;
		System.out.println("Numbers before swapping is: "+"\n"+"Number1: "+num1+" Number2: "+num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swapping is: "+"\n"+"Number1: "+num1+" Number2: "+num2);
	}

	public static void main(String[] args) {
		SwapTwoNumbers s = new SwapTwoNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		s.swapNumbers(num1, num2);
	}
}
