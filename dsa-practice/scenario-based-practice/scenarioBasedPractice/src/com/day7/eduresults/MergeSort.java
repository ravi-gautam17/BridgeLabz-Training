package com.day7.eduresults;

public class MergeSort {

	public static void mergeSort(Student[] students, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			
			mergeSort(students, left, mid);
			mergeSort(students, mid+1, right);
			
			merge(students, left, mid, right);
		}
	}
	
	public static void merge(Student[] students, int left, int mid, int right) {
		int size1 = mid - left + 1;
		int size2 = right - mid;
		
		Student[] L = new Student[size1];
		Student[] R = new Student[size2];
		
		for(int i=0; i<size1; i++)
			L[i] = students[left + i];
		
		for(int j=0; j<size2; j++)
			R[j] = students[mid + 1 + j];
		
		int i = 0, j = 0, k = left;
		
		while(i < size1 && j < size2) {
			if(L[i].marks >= R[j].marks) {
				students[k] = L[i];
				i++;
			}
			else {
				students[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < size1) {
			students[k++] = L[i++];
		}
		
		while(j < size2) {
			students[k++] = R[j++];
		}
	}
}
