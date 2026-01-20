package com.day7.flashdealz;

public class QuickSort {

	public static void quickSort(Product[] products, int low, int high) {
		if(low < high) {
			int pivotIdx = partition(products, low, high);
			
			quickSort(products, low, pivotIdx-1);
			quickSort(products, pivotIdx+1, high);
		}
	}
	
	public static int partition(Product[] products, int low, int high) {
		Product pivot = products[high];
		int i = low-1;
		
		for(int j=low; j<high; j++) {
			if(products[j].discount >= pivot.discount) {
				i++;
				Product temp = products[i];
				products[i] = products[j];
				products[j] = temp;
			}
		}
		
		Product temp = products[i + 1];
		products[i + 1] = products[high];
		products[high] = temp;
		
		return i+1;
	}
}
