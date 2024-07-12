package numberPrograms;

import java.util.Scanner;

/*
 * armstrong number is a number which is equal to sum of cubes of its digits
 * Ex: 
 * number = 153
 * 		  =	(1*1*1)+(5*5*5)+(3*3*3)
 * 		  =	1+125+27
 * 		  =	153
 * 
 * number = 24
 * 		  =	(2*2*2)+(4*4*4)
 *        = 8+64
 *        = 72 
 */

public class ArmstrongNumber {
	
	public void isArmStrongNumber(int num) {
		int temp = num;
		if(num==0) {
			System.out.println("Given number is zero hence not armstrong number");
		}else {
			int sum=0;
			while(num>0) {
				int rem = num % 10;
				sum = (rem * rem * rem) + sum;
				num = num / 10;
			}
			if(sum == temp) {
				System.out.println("Given number is armstrong number");
			}else {
				System.out.println("Given number is not armstrong number");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check armstrong number: ");
		int num = sc.nextInt();
		ArmstrongNumber a = new ArmstrongNumber();
		a.isArmStrongNumber(num);
	}

}
