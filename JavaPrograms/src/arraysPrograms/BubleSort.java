package arraysPrograms;

import java.util.Scanner;

public class BubleSort {

	public void bubbleSort(int[] arr) {
		int len = arr.length;
		int temp;
//		int[] newArr = new int[len];
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array elements are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
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
		System.out.println("Array elemets before sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		BubleSort b = new BubleSort();
		b.bubbleSort(arr);
	}
}
