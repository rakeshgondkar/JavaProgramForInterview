package arraysPrograms;

import java.util.Scanner;

public class MinimumElement {
	
	public void minElement(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Element in array is: "+min);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array element: ");
		int len = sc.nextInt();
		System.out.println("Enter the elements to array: ");
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		MinimumElement m = new MinimumElement();
		m.minElement(arr);
	}

}
