package functionalinterfaces.digitalpaymentservices;

public class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}
