package arraysPrograms;

import java.util.Scanner;

public class ReverseArrayElement {

	public void reverseArray(int[] arr) {
		int[] newArr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArr[i] = arr[arr.length-i-1];
		}
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements in array:");
		int len = sc.nextInt();
		System.out.println("Enter array elemets");
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elemets before reversing: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		ReverseArrayElement b = new ReverseArrayElement();
		b.reverseArray(arr);
	}
}
