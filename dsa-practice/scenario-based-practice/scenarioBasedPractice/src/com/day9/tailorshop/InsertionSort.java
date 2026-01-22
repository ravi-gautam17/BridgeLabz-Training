package com.day9.tailorshop;

public class InsertionSort {
  public static void insertionSort(Order[] orders) {
	  int n=orders.length;
	  for(int i=1;i<n;i++) {
		  for(int j=i;j>0;j--) {
              if(orders[j-1].deadline.compareTo(orders[j].deadline)>0) {
            	     Order temp=orders[j-1];
            	     orders[j-1]=orders[j];
            	     orders[j]=temp;
              }
		  }
	  }
	  
  }
}
