package stringPrograms;

import java.util.Scanner;

public class CountOfCharacters {
	
	public void countCharacter(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count += 1;
			}
		}
		System.out.println("Total Characters in a string is: "+count);
	}
	
	public void countGivenChar(String str,char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count += 1;
			}
		}
		System.out.println("No of "+ch+" repeated in a string is: "+count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		CountOfCharacters c = new CountOfCharacters();
		c.countCharacter(str);
		c.countGivenChar(str, 'p');
	}
}
