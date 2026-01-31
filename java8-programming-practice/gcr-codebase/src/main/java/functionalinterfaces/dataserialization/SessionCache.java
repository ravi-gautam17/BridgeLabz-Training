package functionalinterfaces.dataserialization;

public class SessionCache {

    private String sessionId;
    private long lastAccessTime;

    public SessionCache(String sessionId, long lastAccessTime) {
        this.sessionId = sessionId;
        this.lastAccessTime = lastAccessTime;
    }
}
