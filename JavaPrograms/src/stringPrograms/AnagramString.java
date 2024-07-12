package stringPrograms;

import java.util.Arrays;

public class AnagramString {
	
	public void isAnagramString(String str1,String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() == str2.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Given strings are anagram");
			}
		}else {
			System.out.println("Given strings are not anagrams");
		}
	}

}
