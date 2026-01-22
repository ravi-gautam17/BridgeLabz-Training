package com.day9.medwarehouse;

public class MergeSort {
    public static void mergeSort(Medicine[] med, int left,int right) {
        if(left<right) {
        	    int mid=left+(right-left)/2;
        	    mergeSort(med,left,mid);
        	    mergeSort(med,mid+1,right);
        	    merge(med,left,mid,right);
        	    
        }
        
    }
    public static void merge(Medicine[] med, int l,int mid,int r) {
    	    int n1=mid-l+1;
    	    int n2=r-mid;
    	    Medicine[] left=new Medicine[n1];
    	    Medicine[] right=new Medicine[n2];
    	    
    	    int i=l;
    	    int k=l;
    	
    	    for( i=0;i<n1;i++) {
    	    	   left[i]=med[k];
    	    	   k++;
    	    }
    	    int j=0;
    	    for(j=0;j<n2;j++) {
    	    	  right[j]=med[k];
    	    	  k++;
    	    }
    	    k=l;
    	    i=0;
    	    j=0;
    	    while(i<n1&& j<n2) {
    	    	  if(left[i].expiry.compareTo(right[j].expiry)<0) {
    	    		  med[k++]=left[i++];
    	    	  }else {
    	    		  med[k++]=right[j++];
    	    	  }
    	    }
    	    while(i<n1) {
    	    	 med[k++]=left[i++];
    	    }
    	    while(j<n2) {
    	    	 med[k++]=right[j++];
    	    }
    }
}
