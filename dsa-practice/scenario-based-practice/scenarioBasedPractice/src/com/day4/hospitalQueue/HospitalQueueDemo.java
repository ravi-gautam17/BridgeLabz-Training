package com.day4.hospitalQueue;

public class HospitalQueueDemo {

	public static void bubbleSort(Patient patients[]) {
		int n = patients.length;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(patients[j].criticality < patients[j+1].criticality) {
					Patient temp = patients[j];
					patients[j] = patients[j+1];
					patients[j+1] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient[] patients = {new Patient("P1", 3), new Patient("P2", 9), new Patient("P3", 5), new Patient("P4", 10)};

		bubbleSort(patients);
		System.out.println("Sorted Patients by Criticality:");
		for (Patient p : patients) {
			System.out.println(p.name + " - " + p.criticality);
		}
	}

}
