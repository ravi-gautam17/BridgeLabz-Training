package functionalinterfaces.paymentgatewayintegration;

public interface PaymentProcessor {

    // Existing abstract method
    void processPayment(double amount);

    // New default method (added later)
    default void refund(double amount) {
        System.out.println("Refund is not supported by this payment provider.");
    }
}

