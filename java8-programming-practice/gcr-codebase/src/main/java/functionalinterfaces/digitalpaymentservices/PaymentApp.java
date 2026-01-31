package functionalinterfaces.digitalpaymentservices;

public class PaymentApp {
    public static void main(String[] args) {

        Payment payment1 = new UPI();
        Payment payment2 = new CreditCard();
        Payment payment3 = new Wallet();

        payment1.pay();
        payment2.pay();
        payment3.pay();
    }
}

