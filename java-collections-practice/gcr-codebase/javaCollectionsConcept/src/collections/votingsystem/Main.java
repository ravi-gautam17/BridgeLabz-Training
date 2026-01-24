package collections.votingsystem;

public class Main {
    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();

        vs.castVote("Alice");
        vs.castVote("Bob");
        vs.castVote("Alice");
        vs.castVote("Charlie");
        vs.castVote("Bob");

        vs.displayVoteOrder();
        vs.displaySortedResults();
    }
}
