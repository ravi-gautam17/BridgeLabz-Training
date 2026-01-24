package collections.insurancepolicy2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy(101, "Alice",
                LocalDate.now().plusDays(10), "Health", 5000));

        manager.addPolicy(new Policy(102, "Bob",
                LocalDate.now().plusDays(40), "Auto", 6000));

        manager.addPolicy(new Policy(103, "Alice",
                LocalDate.now().minusDays(5), "Home", 7000));

        manager.addPolicy(new Policy(104, "Charlie",
                LocalDate.now().plusDays(20), "Health", 8000));

        // Retrieve by policy number
        System.out.println("Retrieve Policy 101:");
        System.out.println(manager.getPolicyByNumber(101));

        System.out.println();

        // Policies expiring soon
        manager.policiesExpiringSoon();

        System.out.println();

        // Policies by policyholder
        manager.policiesByHolder("Alice");

        System.out.println();

        // Remove expired policies
        manager.removeExpiredPolicies();

        System.out.println("\nAfter removing expired policies:");
        manager.displayInsertionOrder();
    }
}

