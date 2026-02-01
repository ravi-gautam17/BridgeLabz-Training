package com.day10.avl.hospitalqueue;

public class PatientNode {

	int checkInTime;         
    String patientName;
    int height;
    PatientNode left, right;

    PatientNode(int checkInTime, String patientName) {
        this.checkInTime = checkInTime;
        this.patientName = patientName;
        this.height = 1;
    }
}