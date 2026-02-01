package streamapi.insuranceclaims;

import java.util.*;
import java.util.stream.*;

public class InsuranceAnalysis {
    public static void main(String[] args) {

        List<InsuranceClaim> claims = Arrays.asList(
            new InsuranceClaim("Health", 20000),
            new InsuranceClaim("Vehicle", 15000),
            new InsuranceClaim("Health", 30000),
            new InsuranceClaim("Life", 50000),
            new InsuranceClaim("Vehicle", 25000)
        );
        Map<String, Double> averageClaimByType =
                claims.stream()
                      .collect(Collectors.groupingBy(
                              InsuranceClaim::getClaimType,
                              Collectors.averagingDouble(InsuranceClaim::getClaimAmount)
                      ));

        averageClaimByType.forEach((type, avg) ->
                System.out.println(type + " → Average Claim: " + avg)
        );
    }
}

