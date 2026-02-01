package com.day9.bst.universityrecordsystem;


public class UniversityRecordDemo {

	public static void main(String[] args) {
		

		StudentBST bst = new StudentBST();
		
		bst.root = bst.insert(bst.root, 101, "Ravi");
		bst.insert(bst.root, 102, "Ritesh");
		bst.insert(bst.root, 105, "Mukesh");
		bst.insert(bst.root, 201, "Swaraj");
		
		System.out.println("Student Record Sorted...................");
		bst.inorder(bst.root);
		
		bst.delete(bst.root, 105);
		System.out.println("After Deletion...");
		bst.inorder(bst.root);
		
	}

}