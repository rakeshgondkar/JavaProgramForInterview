package numberPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	public void reverseAndCheckPalindrome(int num) {
		int temp = num,rev=0;
		while(num>0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse Number is: "+rev);
		if(temp==rev) {
			System.out.println("Given number is palindrome number");
		}else {
			System.out.println("Given number is not palindrome number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int num = sc.nextInt();
		ReverseNumber r = new ReverseNumber();
		r.reverseAndCheckPalindrome(num);
	}

}
