package com.csv.basicproblems;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {
	public static void main(String[] args) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("userData.csv"))) {
			bw.append("ID, Name, Department, Salary");
			bw.newLine();
			bw.append("111,Ravi,CSE,10000");
			bw.newLine();
			bw.append("83,Himesh,DataScience,10000");
			bw.newLine();
			bw.append("98,Lucky,DataScience,10000");
			bw.newLine();
			bw.append("141,Rajeev,DataScience,10000");
			bw.newLine();
			bw.append("140,Raj,DataScience,10000");
			bw.newLine();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}