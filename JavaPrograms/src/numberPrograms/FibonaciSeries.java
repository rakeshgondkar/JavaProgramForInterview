package numberPrograms;

import java.util.Scanner;

public class FibonaciSeries {

	public void fiboSeries(int num) {
		int num1 = 0, num2 = 1;
		System.out.println("Fibonaci series for the given number is");
		for(int i=1;i<=num;i++) {
			int num3 = num2+num1;
			num1 = num2;
			num2 = num3;
			System.out.print(num3+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the fibonaci series: ");
		int num = sc.nextInt();
		FibonaciSeries fs = new FibonaciSeries();
		fs.fiboSeries(num);
	}
}
