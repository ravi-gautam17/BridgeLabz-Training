import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of games
        System.out.print("Enter the number of games to play: ");
        int n = sc.nextInt();

        // Arrays to store results
        String[] playerChoices = new String[n];
        String[] computerChoices = new String[n];
        String[] winners = new String[n];

        // Counters for wins
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        // Play games
        for (int i = 0; i < n; i++) {
            System.out.println("\nGame " + (i + 1) + ": Enter your choice (rock/paper/scissors): ");
            String playerChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();

            playerChoices[i] = playerChoice;
            computerChoices[i] = computerChoice;

            String winner = findWinner(playerChoice, computerChoice);
            winners[i] = winner;

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                ties++;
            }

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + winner);
        }

        // Generate stats with percentage
        String[][] stats = calculateStats(playerWins, computerWins, ties, n);

        // Display all game results and stats
        displayResults(playerChoices, computerChoices, winners, stats);

        sc.close();
    }

    // Method to get random computer choice
    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) {
            return "rock";
        } else if (rand < 0.66) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // Method to find winner between player and computer
    public static String findWinner(String player, String computer) {

        if (player.equals(computer)) {
            return "Tie";
        }

        switch (player) {
            case "rock":
                return (computer.equals("scissors")) ? "Player" : "Computer";
            case "paper":
                return (computer.equals("rock")) ? "Player" : "Computer";
            case "scissors":
                return (computer.equals("paper")) ? "Player" : "Computer";
            default:
                return "Invalid"; // Handle invalid input
        }
    }

    // Method to calculate stats and percentages
    public static String[][] calculateStats(int playerWins, int computerWins, int ties, int totalGames) {

        double playerPercent = (playerWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;
        double tiePercent = (ties * 100.0) / totalGames;

        String[][] stats = new String[4][3];

        stats[0][0] = "Player Wins";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercent) + "%";

        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent) + "%";

        stats[2][0] = "Ties";
        stats[2][1] = String.valueOf(ties);
        stats[2][2] = String.format("%.2f", tiePercent) + "%";

        stats[3][0] = "Total Games";
        stats[3][1] = String.valueOf(totalGames);
        stats[3][2] = "100%";

        return stats;
    }

    // Method to display results
    public static void displayResults(String[] playerChoices, String[] computerChoices, String[] winners, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < playerChoices.length; i++) {
            System.out.println((i + 1) + "\t" + playerChoices[i] + "\t" + computerChoices[i] + "\t\t" + winners[i]);
        }

        System.out.println("\nOverall Statistics:");
        System.out.println("Type\t\tCount\tPercentage");
        System.out.println("---------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
}
