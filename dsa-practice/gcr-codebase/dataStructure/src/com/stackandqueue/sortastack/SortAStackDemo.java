package com.stackandqueue.sortastack;

public class SortAStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortAStack stack = new SortAStack();
        
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(0);
        stack.push(2);
        
        SortAStack sorted = sort(stack);
        
        System.out.println("Stack after sorting: ");
        
        while(!sorted.isEmpty()){
            System.out.print(sorted.pop().data + " ");
        }
	}
	
	public static SortAStack sort(SortAStack s) {
		SortAStack ans = new SortAStack();
		
		while(!s.isEmpty()) {
			int n = s.pop().data;
			while(!ans.isEmpty() && n < ans.peek()) {
                s.push(ans.pop().data);
            }
            ans.push(n);
		}
		return ans;
	}

}
