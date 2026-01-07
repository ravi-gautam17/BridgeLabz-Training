package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {3,2, 1, 4, 5, 39, 5, 6, 3};
		System.out.println("Array befor sorting: "+Arrays.toString(arr));
		
		selectionSort(arr);
		System.out.println("Array after sorting: "+ Arrays.toString(arr));
		
	}
	public static void selectionSort(int arr[]) {
		
		for(int i=0; i<arr.length-1;i++) {
			int minIndex = i;
			
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j]<arr[minIndex])
					minIndex = j;
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
