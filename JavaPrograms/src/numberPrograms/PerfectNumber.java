package numberPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public void isPerfectNumber(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
//			System.out.println("value i: "+i);
			if(num%i==0) {
//				System.out.println("divisible i: "+i);
				sum = sum + i;
			}
		}
		System.out.println("Sum value is: "+sum);
		if(sum==num) {
			System.out.println("Given number is a perfect number");
		}else {
			System.out.println("Given number is not a perfect number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check perfect number: ");
		int num = sc.nextInt();
		PerfectNumber p = new PerfectNumber();
		p.isPerfectNumber(num);
	}
}
