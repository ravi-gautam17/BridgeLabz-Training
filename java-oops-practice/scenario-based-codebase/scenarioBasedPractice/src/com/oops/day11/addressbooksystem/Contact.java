package day11.addressbooksystem;


public class Contact {
	
	private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address; 

    public Contact(String firstName, String lastName, String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    @Override
    public String toString() {
        String addr = (address != null) ? address.toString() : "N/A";
        return firstName + " " + lastName + " | Phone: " + phone + " | Email: " + email + " | Address: " + addr;
    }
}