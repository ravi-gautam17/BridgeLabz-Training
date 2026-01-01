package com.objectmodelling.hospitalmanagement;

public class HospitalDemo {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor(101, "Dr. Sharma");
        Doctor d2 = new Doctor(102, "Dr. Mehta");

        Patient p1 = new Patient(201, "Amit");
        Patient p2 = new Patient(202, "Riya");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        hospital.showHospitalDetails();
    }
}
