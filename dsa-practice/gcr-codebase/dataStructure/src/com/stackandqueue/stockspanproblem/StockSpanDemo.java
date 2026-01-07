package com.stackandqueue.stockspanproblem;
import java.util.*;

public class StockSpanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {100, 80, 60, 70, 60, 75, 85};
        
        int[] result = stockSpan(prices);
        
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Span:   " + Arrays.toString(result));
	}
	
	public static int[] stockSpan(int prices[]) {
		int n = prices.length;
		int span[] = new int[n];
		
		Stack stack = new Stack();
		
		for(int i = 0;i<n;i++) {
			int cnt =1;
			
			while(!stack.isEmpty() && stack.peek()[0]<=prices[i]) {
				cnt+= stack.pop()[1];
			}
			stack.push(new int[] {prices[i],cnt});
			span[i] = cnt;
		}
		
		return span;
	}

}
