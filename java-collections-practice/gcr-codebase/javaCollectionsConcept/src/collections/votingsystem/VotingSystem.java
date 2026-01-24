package collections.votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {
   private HashMap<String,Integer> voteCount=new HashMap<>();
   private LinkedHashMap<Integer,String> votesOrder=new LinkedHashMap<>();
   
   private int voteNumber=1;
   // cast a vote 
   public void castVote(String candidate) {
	   votesOrder.put(voteNumber++, candidate);
	   
	   voteCount.put(candidate, voteCount.getOrDefault(candidate,0 )+1);
   }
   public void displayVoteOrder() {
	   for(Map.Entry<Integer,String> entry:votesOrder.entrySet()) {
		   int voteNum=entry.getKey();
		   String candidate=entry.getValue();
		   System.out.println("Vote number : "+voteNum+ " is casted for : "+candidate);
	   }
   }
   
   public void displaySortedResults() {
	   TreeMap<String,Integer> sortedResult=new TreeMap<>(voteCount);
	   for(Map.Entry<String,Integer> entry: sortedResult.entrySet()) {
		   String candidate=entry.getKey();
		   int voteCount=entry.getValue();
		   System.out.println("Candidate Name : "+candidate + " Vote Count : "+voteCount);
	   }
	   
   }
}
