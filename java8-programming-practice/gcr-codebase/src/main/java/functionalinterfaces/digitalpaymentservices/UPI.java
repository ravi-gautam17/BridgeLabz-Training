package functionalinterfaces.digitalpaymentservices;

public class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}
