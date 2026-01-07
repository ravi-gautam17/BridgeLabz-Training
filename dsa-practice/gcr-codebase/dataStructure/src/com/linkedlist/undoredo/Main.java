package com.linkedlist.undoredo;

public class Main {
	 public static void main(String[] args) {

		 TextEditor editor = new TextEditor();
		 
		 editor.addState("Ravi");
		 editor.addState("Ravi");
		 editor.addState("Ravi Gautam is");
		 editor.addState("Ravi Gautam is best ");
		 
		 editor.displayCurrentState();
		 
		 editor.undo();
		 editor.displayCurrentState();
		 
		 editor.undo();
		 editor.displayCurrentState();
		 
		 editor.redo();
		 editor.displayCurrentState();
		 
		 editor.addState("Ravi Bindas");
		 editor.displayCurrentState();
		 	
		 editor.redo(); 
	 }
}
