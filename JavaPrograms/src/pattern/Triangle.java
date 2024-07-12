package pattern;

import java.util.Scanner;

public class Triangle {
	
	public void rightAngleTriangle(int num) {
		for(int i=0;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void reverseRightAngleTriangle(int num) {
		for(int i=0;i<=num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void pyramid(int num) {
		for(int i=0;i<num;i++) {
			for(int j=num-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numner of rows: ");
		int num = sc.nextInt();
		Triangle t = new Triangle();
//		t.rightAngleTriangle(num);
//		t.reverseRightAngleTriangle(num);
		t.pyramid(num);
	}

}
