package streamapi.gymmembership;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class GymApp {
    public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
            new GymMember("Rahul", LocalDate.now().plusDays(10)),
            new GymMember("Amit", LocalDate.now().plusDays(40)),
            new GymMember("Sneha", LocalDate.now().plusDays(25)),
            new GymMember("Priya", LocalDate.now().minusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<GymMember> expiringSoon =
                members.stream()
                       .filter(member ->
                               !member.getExpiryDate().isBefore(today) &&
                               !member.getExpiryDate().isAfter(next30Days)
                       )
                       .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}
