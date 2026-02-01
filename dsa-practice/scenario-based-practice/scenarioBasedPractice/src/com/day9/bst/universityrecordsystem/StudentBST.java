package com.day9.bst.universityrecordsystem;

public class StudentBST {

	Student root;
	
	public Student insert(Student root, int rollNo, String name) {
		if(root == null)
			return new Student(rollNo, name);
		
		if(rollNo < root.rollNo) {
			root.left = insert(root.left, rollNo, name);
		}
		else if(rollNo > root.rollNo) {
			root.right = insert(root.right, rollNo, name);
		}
		
		return root;
	}
	
	
	public Student search(Student root, int rollNo) {
		if(root == null || root.rollNo == rollNo)
			return root;
		
		if(rollNo < root.rollNo)
			return search(root.left, rollNo);
		
		return search(root.right, rollNo);
	}
	
	public Student minValNode(Student node) {
		Student curr = node;
		while(curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}
	
	public Student delete(Student root, int rollNo) {
		if(root == null)
			return root;
		
		if(rollNo < root.rollNo)
			root.left = delete(root.left, rollNo);
		else if(rollNo > root.rollNo)
			root.right = delete(root.right, rollNo);
		else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			Student minNode = minValNode(root.right);
			root.rollNo = minNode.rollNo;
			root.name = minNode.name;
			root.right = delete(root.right, root.rollNo);
		}
		return root;	
	}
	
	public void inorder(Student root) {
		if(root != null) {
			inorder(root.left);
			System.out.println("Roll no: " + root.rollNo + " - " + "Name: " + root.name);
			inorder(root.right);
		}
	}
}
