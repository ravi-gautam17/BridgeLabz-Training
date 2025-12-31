/*
* Sandeep’s Fitness Challenge Tracker 🏋️
* Each day Sandeep completes a number of push-ups.
* Store counts for a week.
* Use for-each to calculate total and average.
* Use continue to skip rest days.
*/

import java.util.*;
public class FitnessTracker{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		String days[]={"Monday","tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int pushUps[]=new int[7];
		int count=0;
		
		// Applying the required logic
		System.out.println("Enter total push-ups");
		for(int i =0;i<7;i++){
			System.out.println(days[i]);
			if(days[i].equals("Sunday")){
				System.out.println("Take rest");
				continue;
			}else{
				pushUps[i]=sc.nextInt();
				count+=pushUps[i];
			}
		}
		double average=(double)count/7;
		
		// Printing the results
		System.out.println("\nSandeep's Fitness Challenge Tracker");
        System.out.printf("%-5s %-15s %-10s%n", "No", "Days", "push-ups");
        System.out.println("---------------------------------------------");
        for(int i = 0; i < 7; i++) {
            System.out.printf("%-5d %-15s %-10s%n",
                    (i+1), days[i], pushUps[i]);
        }
		System.out.println("---------------------------------------------");
		System.out.println("---------------- Total push-ups: "+count);
		System.out.println("---------------- Average : "+average);
	}
}