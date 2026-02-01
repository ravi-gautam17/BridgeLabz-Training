package streamapi.emailnotification;

import java.util.*;

public class EmailNotificationApp {
    public static void main(String[] args) {

        List<String> userEmails = Arrays.asList(
            "rahul@example.com",
            "sneha@example.com",
            "amit@example.com"
        );
        userEmails.forEach(email -> sendNotification(email));
    }

    private static void sendNotification(String email) {
        // Simulating email sending
        System.out.println("Notification email sent to: " + email);
    }
}
