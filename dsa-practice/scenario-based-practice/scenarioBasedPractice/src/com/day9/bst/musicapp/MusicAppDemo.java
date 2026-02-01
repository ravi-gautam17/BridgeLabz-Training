package com.day9.bst.musicapp;

public class MusicAppDemo {

	public static void main(String[] args) {

		SongBST bst = new SongBST();
		bst.root = bst.insert(bst.root, 101, "Khat");
		bst.insert(bst.root, 103, "Say yes to heaven");
		bst.insert(bst.root, 201, "Mocking Bird");
		bst.insert(bst.root, 101, "SummerTime Sadness");
		
		bst.inorder(bst.root);
		SongNode s = bst.search(bst.root, 103);
		System.out.println((s == null) ? "Not Found" : (s.trackId + ", " + s.title));
	}

}
