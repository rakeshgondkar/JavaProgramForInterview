package collectionPrograms;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListProgram {
	
	public void arryToArrayList(String[] arr) {
		List<String> sl = new ArrayList<String>(Arrays.asList(arr));
		System.out.print(sl);
	}
	
	public void reverseList(List<String> al) {
		System.out.println("Length of the List is: "+al.size());
		for(int i=al.size()-1;i>=0;i--) {
			System.out.print(al.get(i).toString()+" ");
		}
		System.out.println();
	}
	
	public void reverseListUsingMethod(List<String> al) {
		System.out.println("Reverse using method");
		Collections.reverse(al);
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int len = sc.nextInt();
//		String[] arr = {"ramesh","suresh","ganesh"};
		ArrayListProgram alp = new ArrayListProgram();
//		alp.arryToArrayList(arr);
		List<String> str = new ArrayList<String>();
		System.out.println("Enter elements to list: ");
		for(int i=0;i<=len;i++) {
			str.add(sc.nextLine());
		}
		alp.reverseList(str);
		alp.reverseListUsingMethod(str);
	}

}
