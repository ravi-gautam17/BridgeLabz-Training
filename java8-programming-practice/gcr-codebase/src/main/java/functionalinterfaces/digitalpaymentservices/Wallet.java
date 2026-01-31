package functionalinterfaces.digitalpaymentservices;

public class Wallet implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using Wallet");
    }
}
