package com.day4.zipzipmart;

public class ZipZipDemo {
	
	public static void mergeSort(Sales[] sales, int left, int right) {
		
		if(left < right) {
			int mid = left + (right - left) / 2;
			
			mergeSort(sales, left, mid);
			mergeSort(sales, mid+1, right);
			
			merge(sales, left, mid, right);
		}
	}
	
	public static void merge(Sales[] sales, int left, int mid, int right) {
		
		int size1 = mid - left + 1;
		int size2 = right - mid;
		
		Sales[] L = new Sales[size1];
		Sales[] R = new Sales[size2];
		
		for(int i=0; i<size1; i++)
			L[i] = sales[left + i];
		
		for(int j=0; j<size2; j++)
			R[j] = sales[mid + 1 + j];
		
		int i = 0, j = 0, k = left;
		
		while(i < size1 && j < size2) {
			if(L[i].date.compareTo(R[j].date) < 0 || (L[i].date.compareTo(R[j].date) == 0 && L[i].amount <= R[i].amount)){
				sales[k++] = L[i++];
			}
			else {
				sales[k++] = R[j++];
			}
		}
		
		while(i < size1) {
			sales[k] = L[i++];
			k++;
		}
		
		while(j < size2) {
			sales[k] = R[j++];
			k++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sales[] sales = {new Sales("2025-12-10", 1500), new Sales("2025-12-12", 1300), new Sales("2025-12-14", 2400), new Sales("2026-01-10", 2500)};
		
		mergeSort(sales, 0, sales.length-1);
		System.out.println("Soted Sales list.....");
		for(Sales sale: sales) {
			System.out.println(sale.date + " " + sale.amount);
		}
		
	}

}
