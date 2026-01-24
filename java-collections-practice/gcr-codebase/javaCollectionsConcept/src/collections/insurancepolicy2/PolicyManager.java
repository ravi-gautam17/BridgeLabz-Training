package collections.insurancepolicy2;

import java.time.LocalDate;
import java.util.*;

class PolicyManager {

    // Fast lookup
    private Map<Integer, Policy> hashMap = new HashMap<>();

    // Maintain insertion order
    private Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();

    // Sorted by expiry date
    private TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);

        treeMap
            .computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>())
            .add(policy);
    }

    // 1️⃣ Retrieve policy by policy number
    public Policy getPolicyByNumber(int policyNumber) {
        return hashMap.get(policyNumber);
    }

    // 2️⃣ Policies expiring within next 30 days
    public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        System.out.println("Policies expiring within 30 days:");
        treeMap.subMap(today, true, limit, true)
               .values()
               .forEach(list -> list.forEach(System.out::println));
    }

    // 3️⃣ Policies for specific policyholder
    public void policiesByHolder(String holderName) {
        System.out.println("Policies for " + holderName + ":");

        hashMap.values().stream()
                .filter(p -> p.getPolicyHolderName().equalsIgnoreCase(holderName))
                .forEach(System.out::println);
    }

    // 4️⃣ Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<Integer, Policy>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Policy policy = iterator.next().getValue();
            if (policy.getExpiryDate().isBefore(today)) {
                iterator.remove();
                linkedHashMap.remove(policy.getPolicyNumber());
            }
        }

        treeMap.headMap(today).clear();
    }

    // Display insertion order
    public void displayInsertionOrder() {
        System.out.println("Policies in insertion order:");
        linkedHashMap.values().forEach(System.out::println);
    }
}

