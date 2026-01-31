package functionalinterfaces.paymentgatewayintegration;

public class StripeProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment of ₹" + amount);
    }

    // Overriding default method
    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " via Stripe");
    }
}

