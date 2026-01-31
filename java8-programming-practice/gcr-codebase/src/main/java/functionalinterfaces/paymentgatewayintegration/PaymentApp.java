package functionalinterfaces.paymentgatewayintegration;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalProcessor();
        PaymentProcessor stripe = new StripeProcessor();

        paypal.processPayment(500);
        paypal.refund(200);

        stripe.processPayment(1000);
        stripe.refund(400);
    }
}
