package com.day10.avl.hospitalqueue;

public class HospitalQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AVLHospitalQueue hospital = new AVLHospitalQueue();
		
		hospital.root = hospital.insert(hospital.root, 900, "Ravi");
        hospital.root = hospital.insert(hospital.root, 930, "Ritesh");
        hospital.root = hospital.insert(hospital.root, 845, "Swaraj");
        hospital.root = hospital.insert(hospital.root, 1000, "Mukesh");
        
        hospital.inorder(hospital.root);
	}

}