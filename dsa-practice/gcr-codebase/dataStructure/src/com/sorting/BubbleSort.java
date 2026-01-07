package sorting;
import java.util.*;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {3,2,1,4,5,39,5,6,3};
		
		System.out.println("Array befor sorting: "+Arrays.toString(arr));
		
		bubbleSort(arr);
		System.out.println("Array after sorting: "+ Arrays.toString(arr));
	}
}
