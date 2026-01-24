package collections.insurancepolicymanagement;

import java.util.*;
import java.time.temporal.ChronoUnit;
class PolicyManager {

    // 1. Fast lookup
    Set<Policy> hashSet = new HashSet<>();

    // 2. Maintain insertion order
    Set<Policy> linkedHashSet = new LinkedHashSet<>();

    // 3. Sorted by expiry date
    Set<Policy> treeSet = new TreeSet<>(
            Comparator.comparing(Policy::getExpiryDate)
                      .thenComparing(Policy::getPolicyNumber)
    );

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }
    public void displayAllPolicies() {
        hashSet.forEach(System.out::println);
    }
    
    public void displayExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        hashSet.stream()
               .filter(p -> !p.getExpiryDate().isBefore(today)
                         && !p.getExpiryDate().isAfter(limit))
               .forEach(System.out::println);
    }
    public void displayByCoverageType(String coverage) {
        hashSet.stream()
               .filter(p -> p.getCoverageType().equalsIgnoreCase(coverage))
               .forEach(System.out::println);
    }
    public static void findDuplicates(List<Policy> policies) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }

        System.out.println("Duplicate Policy Numbers: " + duplicates);
    }
   



}

