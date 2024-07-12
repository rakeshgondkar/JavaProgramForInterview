package numberPrograms;

import java.util.Scanner;

public class SumOfDigits {
	
	public void sumOfDigits(int num) {
		int temp = num,sum=0;
		while(num>0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum of "+temp+" digits "+sum);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		SumOfDigits sd = new SumOfDigits();
		sd.sumOfDigits(num);
	}
}
