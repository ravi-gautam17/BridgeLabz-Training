package functionalinterfaces.dataserialization;

import java.io.*;

public class BackupProcessor {

    public static void backupObject(Object obj) {

        // Check marker interface
        if (!(obj instanceof BackupSerializable)) {
            System.out.println("Object is not marked for backup.");
            return;
        }

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("backup.dat"))) {

            out.writeObject(obj);
            System.out.println("Backup completed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
