package functionalinterfaces.sensitivedatatagging;

public class CustomerDetails implements SensitiveData {

    private String name;
    private String aadhaarNumber;

    public CustomerDetails(String name, String aadhaarNumber) {
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getName() {
        return name;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }
}
