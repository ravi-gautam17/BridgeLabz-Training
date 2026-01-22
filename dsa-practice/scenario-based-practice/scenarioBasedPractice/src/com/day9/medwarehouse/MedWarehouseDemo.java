package com.day9.medwarehouse;

public class MedWarehouseDemo {
  public static void main(String[] args) {
	  Medicine[] medicines = {new Medicine("M101", "2026-03-10T10:00"), new Medicine("M102", "2025-12-05T09:30"), new Medicine("M103", "2026-01-20T14:15"), new Medicine("M104", "2025-11-01T08:45")};
	  
	  int end=medicines.length-1;
	  MergeSort.mergeSort(medicines,0,end);
	  
	  for(Medicine medicine:medicines) {
		  System.out.println(medicine.medId+" -> "+medicine.expiry);
	  }
	  
  }
}
