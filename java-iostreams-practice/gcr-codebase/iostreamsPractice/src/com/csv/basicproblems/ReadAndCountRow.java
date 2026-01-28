package com.csv.basicproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class ReadAndCountRow {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("userData.csv"))) {
			String line;
			boolean isHeader = true;
			int cnt=0;
			while((line=br.readLine())!=null) {
				if(isHeader) {
					isHeader=false;
					continue;
				}
				String st[] = line.split(",");
				System.out.println("ID: "+st[0].trim()+
						", Name: "+st[1].trim()+
						", Dept: "+st[2].trim()+
						", Salary: "+st[3].trim());
				cnt++;
				}
			System.out.println("\nTotal records: "+cnt);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}