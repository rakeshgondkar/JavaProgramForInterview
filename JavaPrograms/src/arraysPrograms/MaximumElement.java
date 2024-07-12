package arraysPrograms;

import java.util.Scanner;

public class MaximumElement {

	public void maxElement(int[] arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element in array is: "+max);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element in a array: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements to array: ");
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		MaximumElement m = new MaximumElement();
		m.maxElement(arr);
	}
}
