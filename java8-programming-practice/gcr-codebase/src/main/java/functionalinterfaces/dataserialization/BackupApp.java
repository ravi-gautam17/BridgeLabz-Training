package functionalinterfaces.dataserialization;

public class BackupApp {

    public static void main(String[] args) {

        UserAccount user = new UserAccount("john_doe", "john@email.com");
        SessionCache cache = new SessionCache("ABC123", System.currentTimeMillis());

        BackupProcessor.backupObject(user);   // Allowed
        BackupProcessor.backupObject(cache);  // Blocked
    }
}

