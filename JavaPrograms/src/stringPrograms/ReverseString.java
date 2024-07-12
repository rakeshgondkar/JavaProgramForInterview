package stringPrograms;

import java.util.Scanner;

public class ReverseString {
	
	public void reverseString(String str) {
		String s = "";
		for(int i=str.length()-1;i>=0;i--) {
			s = s + str.charAt(i);
		}
		System.out.println("Reversal String is: "+s);
	}
	
	
	public void reverseStringUsingMethod(String str) {
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverseString = sb.reverse();
		System.out.println("Reverse String is: "+reverseString);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		String str = sc.nextLine();
		ReverseString rs = new ReverseString();
		rs.reverseString(str);
		rs.reverseStringUsingMethod(str);
	}

}
