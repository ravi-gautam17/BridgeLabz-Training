package lambdaexpressions.notificationfiltering;

class Alert {
    String message;
    String type;       // CRITICAL, WARNING, INFO
    int priority;      // 1 (Low) to 5 (High)

    public Alert(String message, String type, int priority) {
        this.message = message;
        this.type = type;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "[" + type + "] (Priority " + priority + ") : " + message;
    }
}

