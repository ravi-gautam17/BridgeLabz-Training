package collections.insurancepolicymanagement;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Policy> policies = new ArrayList<>();

        for (int i = 1; i <= 10_000; i++) {
            policies.add(new Policy(
                    i,
                    "User" + i,
                    LocalDate.now().plusDays(i % 60),
                    i % 2 == 0 ? "Health" : "Auto",
                    5000 + i
            ));
        }

        performanceTest(new HashSet<>(), "HashSet", policies);
        performanceTest(new LinkedHashSet<>(), "LinkedHashSet", policies);
        performanceTest(new TreeSet<>(
                Comparator.comparing(Policy::getExpiryDate)
                          .thenComparing(Policy::getPolicyNumber)),
                "TreeSet", policies);
    }
    public static void performanceTest(Set<Policy> set, String name, List<Policy> policies) {
        long start, end;

        // Add
        start = System.nanoTime();
        set.addAll(policies);
        end = System.nanoTime();
        System.out.println(name + " Add Time: " + (end - start));

        // Search
        Policy searchPolicy = policies.get(policies.size() / 2);
        start = System.nanoTime();
        set.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println(name + " Search Time: " + (end - start));

        // Remove
        start = System.nanoTime();
        set.remove(searchPolicy);
        end = System.nanoTime();
        System.out.println(name + " Remove Time: " + (end - start));

        System.out.println("--------------------------------");
    }
}

