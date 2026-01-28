package com.csv.intermediateproblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FilterRecords {
	public static void main(String[] args) {
		try(BufferedReader br =new BufferedReader(new FileReader("marks.csv"))) {
			String line;
			boolean isHeader = true;
			
			while((line=br.readLine())!=null) {
				if(isHeader) {
					isHeader = false;
					continue;
				}
				String s[] = line.split(",");
				
				String name = s[0].trim();
				int marks = Integer.parseInt(s[1].trim());
				if(marks>=80) {
					System.out.println("Name: "+name+", marks: "+marks);
				}
				
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}