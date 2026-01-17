package com.day4.examcell;

public class ExamCellDemo {

	public static void mergeSort(Scores[] score, int left, int right) {
		
		if(left < right) {
			int mid = left + (right - left) / 2;
			
			mergeSort(score, left, mid);
			mergeSort(score, mid+1, right);
			
			merge(score, left, mid, right);
		}
	}
	
	public static void merge(Scores[] score, int left, int mid, int right) {
		
		int size1 = mid - left + 1;
		int size2 = right - mid;
		
		Scores[] L = new Scores[size1];
		Scores[] R = new Scores[size2];
		
		for(int i=0; i<size1; i++)
			L[i] = score[left + i];
		
		for(int j=0; j<size2; j++)
			R[j] = score[mid + 1 + j];
		
		int i = 0, j = 0, k = left;
		
		while(i < size1 && j < size2) {
			if(L[i].score >= R[j].score) {
				score[k] = L[i];
				i++;
			}
			else {
				score[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < size1) {
			score[k] = L[i++];
			k++;
		}
		
		while(j < size2) {
			score[k] = R[j++];
			k++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scores[] center1 = {new Scores("Ravi", 87), new Scores("Mukesh", 90), new Scores("Rajesh", 93), new Scores("Mohit", 86)};
		Scores[] center2 = {new Scores("Ashish", 89), new Scores("Ritesh", 76), new Scores("Himesh", 94), new Scores("Swaraj", 82)};
		
		int totalSize = center1.length + center2.length;
		Scores[] result = new Scores[totalSize];
		
		int idx = 0;
		for(Scores score: center1)
			result[idx++] = score;
		for(Scores score: center2)
			result[idx++] = score;
		
		mergeSort(result, 0, totalSize-1);
		
		System.out.println("State-Level Rank List.................");
		for(Scores student: result)
			System.out.println(student.studentName + " - " + student.score);
		
	}

}
