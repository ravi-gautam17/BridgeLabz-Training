package collections.queueinterface.generatebinary;

import java.util.*;
public class GenerateBinaryNum {
   public static void main(String[] args) {
	   int n=5;
	   System.out.println(generateBinary(n));
   }
   public static List<String> generateBinary(int n){
	   List<String> result=new ArrayList<>();
	   Queue<String> q=new LinkedList<>();
	   
	   q.add("1");
	   
	   for(int i=0;i<n;i++) {
		   String curr=q.remove();
		   result.add(curr);
		   q.add(curr+"0");
		   q.add(curr+"1");
	   }
	   return result;
   }
}
