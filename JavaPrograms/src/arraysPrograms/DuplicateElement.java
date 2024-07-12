package arraysPrograms;

import java.util.Scanner;

public class DuplicateElement {
	
	public void duplicateElement(int[] arr) {
		int duplicate = arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					duplicate = arr[i];
				}
			}
		}
		System.out.println("Duplicate Element in array is: "+duplicate);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of array element: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements to array: ");
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		DuplicateElement de = new DuplicateElement();
		de.duplicateElement(arr);
	}

}
