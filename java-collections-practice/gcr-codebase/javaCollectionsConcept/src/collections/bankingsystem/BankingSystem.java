package collections.bankingsystem;

import java.util.*;
public class BankingSystem {
  public static void main(String[] args) {
	  Map<Integer,Integer> accounts=new HashMap<>();
	  accounts.put(101, 10000);
	  accounts.put(102, 13000);
	  accounts.put(103, 14000);
	  accounts.put(104, 8000);
	  
	  Queue<WithdrawalRequest> queue=new LinkedList<>();
	  queue.add(new WithdrawalRequest(101,1800));
	  queue.add(new WithdrawalRequest(102,1500));
	  queue.add(new WithdrawalRequest(103,2000));
	  queue.add(new WithdrawalRequest(102,1000));
	  
	  while(!queue.isEmpty()) {
		  WithdrawalRequest q=queue.remove();
		  int accNo=q.accNo;
		  int amount=q.amount;
          
			  if(accounts.get(accNo)>amount) {
				  accounts.put(accNo,accounts.get(accNo)-amount);
			  }
			  else {
				  System.out.println("Not sufficient money");				  
			  }
		  }
	   TreeMap<Integer,List<Integer>> sortedMap=new TreeMap<>();
	   for(Map.Entry<Integer,Integer> entry: accounts.entrySet()){
		   int balance=entry.getValue();
		   int accNo=entry.getKey();
		   sortedMap
		    .computeIfAbsent(balance, k -> new ArrayList<>())
		    .add(accNo);

		   
	   }
	   
	   System.out.println("The employee sorted on the basis of balance with their accountNo. associated with them is ");
	   System.out.println(sortedMap);
		   
	   }
	   }
  

