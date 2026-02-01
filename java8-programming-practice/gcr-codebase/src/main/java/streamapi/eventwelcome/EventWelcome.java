package streamapi.eventwelcome;

import java.util.*;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Rahul",
            "Sneha",
            "Amit",
            "Priya"
        );
        attendees.forEach(name ->
        System.out.println("Welcome to the event, " + name + "!")
);
}
}

