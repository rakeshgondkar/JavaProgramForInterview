package numberPrograms;

import java.util.Scanner;

public class OddAndEven {
	
	public void oddNumbers(int num) {
		System.out.println("Odd Numbers between 0 and "+num);
		for(int i=1;i<=num;i++) {
			int oddNumber = 0;
			if(num%i!=0) {
				oddNumber = 1;
			}
		if(oddNumber==1) {
			System.out.print(i+" ");
		}
		}
		System.out.println();
	}
	
	public void evenNumbers(int num) {
		System.out.println("Even Numbers between 0 and "+num);
		for(int i=1;i<=num;i++) {
			int evenNumber = 0;
			if(num%i==0) {
				evenNumber = 1;
			}
		if(evenNumber==1) {
			System.out.print(i+" ");
		}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the odd or even numbers: ");
		int num = sc.nextInt();
		OddAndEven oe = new OddAndEven();
		oe.oddNumbers(num);
		oe.evenNumbers(num);
	}

}
