package stacksandqueue.circulartourproblem;

public class CircularTour {
	public static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0;
        int deficit = 0;
        int currentBalance = 0;

        for (int i = 0; i < pumps.length; i++) {
            currentBalance += pumps[i].petrol - pumps[i].distance;
            
            if (currentBalance < 0) {
                start = i + 1;   
                deficit += currentBalance;
                currentBalance = 0; 
            }
        }

        return (currentBalance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };

        int result = findStartingPoint(pumps);

        if (result == -1) {
            System.out.println("No circular tour possible.");
        } else {
            System.out.println("Starting point index: " + result);
        }
    }
}
