package numberPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public void isPrimeNumber(int num) {
		if(num==0 || num==1) {
			System.out.println("Given number is not a primenumber");
		}else {
			int fact=0;
			int half = num/2;
			for(int i=2;i<=half;i++) {
				if(num%i==0) {
					fact = 1;
				}
			}
			if(fact==0) {
				System.out.println("Given number is a prime number");
			}else {
				System.out.println("Given number is not a prime number");
			}
		}
	}
	
	public void primePrimeNumbers(int num) {
		System.out.println("Prime number between 1 to "+num+" is:");
		for(int i=2;i<=num;i++) {
			int fact = 0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					fact = 1;
					break;
				}
			}
			if(fact==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find prime number: ");
		int num = sc.nextInt();
		PrimeNumber p = new PrimeNumber();
		p.isPrimeNumber(num);
		p.primePrimeNumbers(num);
	}

}
