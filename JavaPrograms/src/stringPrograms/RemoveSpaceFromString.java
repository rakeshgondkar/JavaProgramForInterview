package stringPrograms;

import java.util.Scanner;

public class RemoveSpaceFromString {
	
	public void removeSpace(String str) {
		String newStr = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!Character.isWhitespace(ch)) {
				newStr += ch;
			}
		}
		System.out.println("New String is: "+newStr);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		RemoveSpaceFromString rs = new RemoveSpaceFromString();
		rs.removeSpace(str);
	}
}
