package streamapi.nametransformation;

import java.util.*;
import java.util.stream.*;

public class CustomerDisplay {
    public static void main(String[] args) {

        List<String> customerNames = Arrays.asList(
            "Rahul",
            "amit",
            "Sneha",
            "priya",
            "Ankit"
        );
        
        List<String> formattedNames =
                customerNames.stream()
                             .map(String::toUpperCase) // 1️⃣ convert to uppercase
                             .sorted()                 // 2️⃣ sort alphabetically
                             .collect(Collectors.toList());

        formattedNames.forEach(System.out::println);
    }
}

