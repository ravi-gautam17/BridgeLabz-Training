package functionalinterfaces.sensitivedatatagging;

public class SecurityApp {

    public static void main(String[] args) {

        CustomerDetails customer =
                new CustomerDetails("Ravi", "1234-5678-9012");

        ProductInfo product =
                new ProductInfo("P101", "Insurance Policy");

        EncryptionProcessor.encryptIfSensitive(customer);
        EncryptionProcessor.encryptIfSensitive(product);
    }
}

