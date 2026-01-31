package functionalinterfaces.dataserialization;

import java.io.Serializable;

public class UserAccount implements Serializable, BackupSerializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private String email;

    public UserAccount(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
