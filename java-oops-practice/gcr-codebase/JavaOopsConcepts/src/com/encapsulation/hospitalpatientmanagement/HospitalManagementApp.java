package com.encapsulation.hospitalpatientmanagement;
import java.util.*;

public class HospitalManagementApp {
	public static void main(String[] args) {

        List<Patient> hospitalList = new ArrayList<>();

        InPatient p1 = new InPatient("INP001", "Shriyansh", 45, 5, 500.0);
        p1.addRecord("Admitted for surgery");
        p1.addRecord("Post-op recovery stable");

        OutPatient p2 = new OutPatient("OUT002", "Ashish", 30, 150.0, 300.0);
        p2.addRecord("Routine checkup");

        hospitalList.add(p1);
        hospitalList.add(p2);

        System.out.println("--- Hospital Billing & Records ---");
        for (Patient p : hospitalList) {
            System.out.println(p.getPatientDetails());
            System.out.println("Total Bill: $" + p.calculateBill());
            
            p.viewRecords();
            System.out.println("----------------------------------");
        }
    }
}
