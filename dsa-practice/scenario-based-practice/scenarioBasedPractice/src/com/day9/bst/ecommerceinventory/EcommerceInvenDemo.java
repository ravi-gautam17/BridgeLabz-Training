package com.day9.bst.ecommerceinventory;

public class EcommerceInvenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductBST bst = new ProductBST();
		
		bst.root = bst.insert(bst.root, 101, "Laptop", 25000);
		bst.insert(bst.root, 103, "Mouse", 2300);
		bst.insert(bst.root, 202, "Headphone", 4500);
		bst.insert(bst.root, 104, "Cable", 500);
		
		bst.inorder(bst.root);
		bst.updatePrice(bst.root, 103, 2599);
		System.out.println("After Updating.....");
		
		bst.inorder(bst.root);
	}

}
