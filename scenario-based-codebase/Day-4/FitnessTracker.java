/*
* Sandeep’s Fitness Challenge Tracker 🏋️
* Each day Sandeep completes a number of push-ups.
* Store counts for a week.
* Use for-each to calculate total and average.
* Use continue to skip rest days.
*/

import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int[] pushUp=new int[7];
		boolean[] restDay={false,false,true,false,true,false,false};	
		for(int i=0;i<7;i++){
		  if(restDay[i]){
			  pushUp[i]=0;
			  continue;
		  }
		  else{
			System.out.println("Enter push-ups count for day : "+(i+1));
		    pushUp[i]=sc.nextInt();
		  }	
		}
		int maxPushUp=findMaxPushUp(pushUp,restDay);
		double avgPushUp=findAvgPushUp(pushUp,restDay);
		
		System.out.println("Maximum push-ups in a day :"+maxPushUp);
		System.out.println("Average push-ups in a week :"+avgPushUp);
		
		
        sc.close();
    }
    
	
	// Find the maximum push-ups
	public static int findMaxPushUp(int[] pushUp,boolean[] restDay){
	  int max=Integer.MIN_VALUE;
		for(int i=0;i<7;i++){
		 if(restDay[i]) continue;
		  max=Math.max(max,pushUp[i]);		  
		}
		return max;	
	}
	// Find the average push-ups
	public static double findAvgPushUp(int[] pushUp, boolean[] restDay){
	    int sum=0;
		int workingDays=0;
		for(int i=0;i<7;i++){
		  if(restDay[i]){
       		  continue;
		  }
		  workingDays++;
		  sum+=pushUp[i];		  
		}
		double avgPushUp=(double)sum/workingDays;
		return avgPushUp;
	}
}
