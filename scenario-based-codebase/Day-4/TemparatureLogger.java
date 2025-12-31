/*
* Temperature Logger 🌡️
* Record temperatures over 7 days.
* Use array and for-loop.
* Find average and max temperature.
* Use if for comparisons.
* Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;

public class TemparatureLogger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    double[] temp=new double[7];
		
		for(int i=0;i<7;i++){
	      System.out.println("Enter the day number : "+(i+1));
		  temp[i]=sc.nextDouble();
		  
		}
		double maxTemp=findMaxTemp(temp);
		double avgTemp=findAvgTemp(temp);
		System.out.println("The maximum temparature is "+maxTemp);
		System.out.println("The average temparature is "+avgTemp);
		
        sc.close();
    }
	
	// Find the maximum temparature
	public static double findMaxTemp(double[] temp){
	  double maxTemp=Double.MIN_VALUE;
		for(int i=0;i<7;i++){
		  maxTemp=Math.max(maxTemp,temp[i]);		  
		}
		return maxTemp;	
	}
	// Find the average temparature 
	public static double findAvgTemp(double[] temp){
	    double sumOfTemp=0.0;
		for(int i=0;i<7;i++){
		  sumOfTemp+=temp[i];		  
		}
		double avgTemp=sumOfTemp/7;
		return avgTemp;
	}
}