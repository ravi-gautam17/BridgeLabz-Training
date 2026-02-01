package com.day9.bst.musicapp;

public class SongBST {

	SongNode root;
	
	public SongNode insert(SongNode root, int trackId, String title) {
		if(root == null)
			return new SongNode(trackId, title);
		
		if(title.compareToIgnoreCase(root.title) < 0)
			root.left = insert(root.left, trackId, title);
		else if(title.compareToIgnoreCase(root.title) > 0)
			root.right = insert(root.right, trackId, title);
		
		return root;
	}
	
	// search by trackId
	public SongNode search(SongNode root, int trackId) {
		if(root == null)
			return root;
		
		if(root.trackId == trackId)
			return root;
		
		SongNode leftSide = search(root.left, trackId);
		if(leftSide != null) {
			return leftSide;
		}
		
		return search(root.right, trackId);
	}
	
	public void inorder(SongNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.println("Track ID: " + root.trackId + ", Title: " + root.title);
			inorder(root.right);
		}
	}
}
